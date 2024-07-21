package br.com.moreira.digitalbank.api;

import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

public class TaxaRendApi {
    private static final String API_URL = "https://brasilapi.com.br/api/taxas/v1/cdi";

    public static BigDecimal getTaxaCdi() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(API_URL, String.class);
        String responseBody = response.getBody();

        // Parse JSON response to get the taxa cdi value
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode;
        try {
            jsonNode = objectMapper.readTree(responseBody);
            BigDecimal taxaCdi = jsonNode.get("valor").decimalValue();
            return taxaCdi;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return BigDecimal.ZERO; // Return default value or handle error
        }

    }
}

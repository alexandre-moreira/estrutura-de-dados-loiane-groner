package br.com.moreira.digitalbank.validation;

import br.com.moreira.digitalbank.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepeatPasswordValidation {
    @Autowired
    private CardRepository cardRepository;

    public boolean repeatPasswordValidation(Long id, String password) {
        return cardRepository.findCardById(id).getPassword().equals(password);
    }
}
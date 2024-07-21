package br.com.moreira.digitalbank.controller;

import br.com.moreira.digitalbank.dto.ContaDto;
import br.com.moreira.digitalbank.entity.ContaCorrente;
import br.com.moreira.digitalbank.entity.ContaPoupanca;
import br.com.moreira.digitalbank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    ContaService contaService;

    @GetMapping("/{id}")
    public ResponseEntity<ContaDto> findContaById(@PathVariable Long id) {
        return ResponseEntity.ok(contaService.findContaById(id));
    }

    @GetMapping("/{idConta}/saldo")
    public ResponseEntity<BigDecimal> getSaldo(@PathVariable Long idConta){
        return ResponseEntity.ok(contaService.getSaldo(idConta));
    }

    @PutMapping("/transfPix/{idDestino}")
    public ResponseEntity<String> transferenciaPix (Long idOrigem, Long idDestino, BigDecimal valor) {
        contaService.transferenciaPix(idOrigem, idDestino, valor);
        return ResponseEntity.ok("Transferência realizada com sucesso!");
    }

    @PostMapping("/saveContaCorrente")
    public ResponseEntity<ContaCorrente> saveContaCorrente(@RequestBody ContaCorrente contaCorrente) {
        return new ResponseEntity<>(contaService.saveContaCorrente(contaCorrente), HttpStatus.CREATED);
    }

    @PostMapping("/saveContaPoupanca")
    public ResponseEntity<ContaPoupanca> saveContaPoupanca(@RequestBody ContaPoupanca contaPoupanca) {
        return new ResponseEntity<>(contaService.saveContaPoupanca(contaPoupanca), HttpStatus.CREATED);
    }

}
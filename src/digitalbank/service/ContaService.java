package br.com.moreira.digitalbank.service;

import br.com.moreira.digitalbank.dto.ContaDto;
import br.com.moreira.digitalbank.entity.Conta;
import br.com.moreira.digitalbank.entity.ContaCorrente;
import br.com.moreira.digitalbank.entity.ContaPoupanca;
import br.com.moreira.digitalbank.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ContaService {
    @Autowired
    ContaRepository contaRepository;
    public ContaDto findContaById(Long id) {
        return ContaDto.convertContaToDto(contaRepository.findContaById(id));
    }

    public BigDecimal getSaldo(Long idConta) {
        return contaRepository.findContaById(idConta).getSaldo();
    }

    public void transferenciaPix(Long idOrigem, Long idDestino, BigDecimal valor) {
        Conta contaOrigem = contaRepository.findContaById(idOrigem);
        contaOrigem.setSaldo(contaOrigem.getSaldo().subtract(valor));
        contaRepository.save(contaOrigem);

        Conta contaDestino = contaRepository.findContaById(idDestino);
        contaDestino.setSaldo(contaDestino.getSaldo().add(valor));
        contaRepository.save(contaDestino);

    }

    public ContaCorrente saveContaCorrente (ContaCorrente contaCorrente){
        return contaRepository.save(contaCorrente);
    }

    public ContaPoupanca saveContaPoupanca (ContaPoupanca contaPoupanca) {
        return contaRepository.save(contaPoupanca);
    }


}
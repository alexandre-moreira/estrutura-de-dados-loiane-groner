package br.com.moreira.digitalbank.repository;

import br.com.moreira.digitalbank.entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaCorrenteRepository extends JpaRepository<CreditCard, Long> {

}
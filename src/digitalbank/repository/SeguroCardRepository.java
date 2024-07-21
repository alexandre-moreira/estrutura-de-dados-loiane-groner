package br.com.moreira.digitalbank.repository;

import br.com.moreira.digitalbank.entity.ApoliceSeguro;
import br.com.moreira.digitalbank.entity.SeguroCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeguroCardRepository extends JpaRepository<SeguroCard, Long> {
}
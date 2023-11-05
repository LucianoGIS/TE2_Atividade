package br.com.eureka.eureka.repository;

import br.com.eureka.eureka.model.ObjetivoEstrategico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetivoEstrategicoRepository extends JpaRepository<ObjetivoEstrategico, Integer> {
}

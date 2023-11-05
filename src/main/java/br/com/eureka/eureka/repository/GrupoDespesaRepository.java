package br.com.eureka.eureka.repository;

import br.com.eureka.eureka.model.GrupoDespesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoDespesaRepository extends JpaRepository<GrupoDespesa, Integer> {
}

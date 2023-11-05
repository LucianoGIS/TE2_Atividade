package br.com.eureka.eureka.repository;

import br.com.eureka.eureka.model.UnidadeOrcamentariaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeOrcamentariaRepository extends JpaRepository<UnidadeOrcamentariaModel, Integer> {
}

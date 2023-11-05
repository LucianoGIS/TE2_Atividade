package br.com.eureka.eureka.repository;

import br.com.eureka.eureka.model.UnidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeRepository extends JpaRepository<UnidadeModel, Integer> {
}

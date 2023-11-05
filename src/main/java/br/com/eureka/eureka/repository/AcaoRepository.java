package br.com.eureka.eureka.repository;

import br.com.eureka.eureka.model.AcaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcaoRepository extends JpaRepository<AcaoModel , Integer> {
}

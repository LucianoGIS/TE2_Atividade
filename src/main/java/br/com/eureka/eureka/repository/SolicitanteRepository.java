package br.com.eureka.eureka.repository;

import br.com.eureka.eureka.model.Solicitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitanteRepository extends JpaRepository<Solicitante, Integer> {
}

package br.com.eureka.eureka.repository;

import br.com.eureka.eureka.model.Programa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramaRepository extends JpaRepository<Programa, Integer> {
}

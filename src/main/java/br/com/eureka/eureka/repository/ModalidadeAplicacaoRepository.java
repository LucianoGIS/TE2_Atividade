package br.com.eureka.eureka.repository;

import br.com.eureka.eureka.model.ModalidadeAplicacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeAplicacaoRepository extends JpaRepository<ModalidadeAplicacao, Integer> {
}

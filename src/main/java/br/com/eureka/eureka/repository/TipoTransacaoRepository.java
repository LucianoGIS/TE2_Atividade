package br.com.eureka.eureka.repository;

import br.com.eureka.eureka.model.TipoTransacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TipoTransacaoRepository extends JpaRepository<TipoTransacao, Integer> {
}

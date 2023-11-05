package br.com.eureka.eureka.repository;

import br.com.eureka.eureka.model.TipoLancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoLancamentoRepository extends JpaRepository<TipoLancamento, Integer> {
}


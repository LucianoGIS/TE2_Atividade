package br.com.eureka.eureka.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="tbTipoLancamento")

public class TipoLancamento {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "nome", length = 255, nullable = false)
        private String nome;

        @Column(name = "dataCadastro", nullable = false)
        private LocalDateTime dataCadastro;

        @Column(name = "dataAlteracao")
        private LocalDateTime dataAlteracao;
}

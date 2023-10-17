package br.com.eureka.eureka.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name="ModalidadeAplicacao")
public class ModalidadeAplicacao {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Codigo;

    @Column(name = "Nome", length = 100, nullable = false)
    private String Nome;

    @Column(name = "DataCadastro", nullable = false)
    private LocalDate DataCadastro;

    @Column(name = "DataAlteracao", nullable = false)
    private LocalDate DataAlteracao;

}

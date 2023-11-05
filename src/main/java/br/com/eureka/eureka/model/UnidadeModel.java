package br.com.eureka.eureka.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "tbUnidade")
public class UnidadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Identificador único para a Unidade

    @Column(name = "nome", length = 255, nullable = false)
    private String nome; // Nome da Unidade

    @Column(name = "dataCadastro", nullable = false)
    private LocalDateTime dataCadastro; // Data de cadastro da Unidade

    @Column(name = "dataAlteracao")
    private LocalDateTime dataAlteracao; // Data da última alteração da Unidade
}
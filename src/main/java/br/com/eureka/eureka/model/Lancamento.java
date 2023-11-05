package br.com.eureka.eureka.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "tbLancamentos")
public class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "lancamentoInvalido", nullable = false)
    private boolean lancamentoInvalido;

    @Column(name = "numeroLancamento")
    private Integer numeroLancamento;

    @Column(name = "idTipoLancamento", nullable = false)
    private Integer idTipoLancamento;

    @Column(name = "dataLancamento", nullable = false)
    private LocalDate dataLancamento;

    @Column(name = "idLancamentoPai")
    private Integer idLancamentoPai;

    @Column(name = "idUnidade", nullable = false)
    private Integer idUnidade;

    @Column(name = "descricao", length = 255, nullable = false)
    private String descricao;

    @Column(name = "idUnidadeOrcamentaria", nullable = false)
    private Integer idUnidadeOrcamentaria;

    @Column(name = "idPrograma", nullable = false)
    private Integer idPrograma;

    @Column(name = "idAcao", nullable = false)
    private Integer idAcao;

    @Column(name = "idFonteRecurso", nullable = false)
    private Integer idFonteRecurso;

    @Column(name = "idGrupoDespesa", nullable = false)
    private Integer idGrupoDespesa;

    @Column(name = "idModalidadeAplicacao", nullable = false)
    private Integer idModalidadeAplicacao;

    @Column(name = "idElementoDespesa", nullable = false)
    private Integer idElementoDespesa;

    @Column(name = "idSolicitante")
    private Integer idSolicitante;

    @Column(name = "ged", length = 27)
    private String ged;

    @Column(name = "contratado", length = 255)
    private String contratado;

    @Column(name = "idObjetivoEstrategico")
    private Integer idObjetivoEstrategico;

    @Column(name = "valor", nullable = false)
    private Float valor;

    @Column(name = "idTipoTransacao", nullable = false)
    private Integer idTipoTransacao;

    @Column(name = "dataCadastro", nullable = false)
    private LocalDateTime dataCadastro;

    @Column(name = "dataAlteracao")
    private LocalDateTime dataAlteracao;

    @Column(name = "anoOrcamento", nullable = false)
    private Short anoOrcamento;
}
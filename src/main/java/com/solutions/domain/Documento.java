package com.solutions.domain;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "documento_identificacao", schema = "padrao")
public class Documento extends PanacheEntityBase {

    @Id
    private Long id;

    @Column(name = "tipo_documento", nullable = false)
    private TipoDocumento documento;

    @Column(name = "numero_documento", length = 50, nullable = false)
    private String numero;

    @Column(name = "data_expedicao", nullable = false)
    private LocalDate dataExpedicao;

    @Column(name = "data_expiracao")
    private LocalDate dataExpiracao;

    @Column(name = "orgao_emissor", length = 50, nullable = false)
    private String OrgaoEmissor;

    @OneToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa proprietario;


    public TipoDocumento getDocumento() {
        return documento;
    }

    public void setDocumento(TipoDocumento documento) {
        this.documento = documento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(LocalDate dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public String getOrgaoEmissor() {
        return OrgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        OrgaoEmissor = orgaoEmissor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
}
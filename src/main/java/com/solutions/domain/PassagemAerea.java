package com.solutions.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "passagem_aerea", schema = "padrao")
public class PassagemAerea extends PanacheEntityBase {

    @Id
    private Long id;

    @Column(name = "companhia", length = 50, nullable = false)
    private String compania;

    @Column(name = "origem", length = 50, nullable = false)
    private String origem;

    @Column(name = "destino", length = 50, nullable = false)
    private String destino;

    @Column(name = "data_partida", nullable = false)
    private LocalDate dataPartida;

    @Column(name = "preco_passagem", nullable = false)
    private Float preco;

    @Column(name = "preco_bagagem")
    private Float precoBagagem;

    @ManyToOne
    @JoinColumn(name = "id_pessoa", nullable = false)
    private Pessoa passageiro;

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Float getPrecoBagagem() {
        return precoBagagem;
    }

    public void setPrecoBagagem(Float precoBagagem) {
        this.precoBagagem = precoBagagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Pessoa passageiro) {
        this.passageiro = passageiro;
    }
}

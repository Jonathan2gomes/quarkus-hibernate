package com.solutions.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pet", schema = "padrao")
public class Pet extends PanacheEntityBase {

    @Id
    @Column(name = "id_pet")
    private Long id;

    @Column(name = "nome_pet", length = 50, nullable = false)
    private String nome;

    @Column(name = "tipo_animal", nullable = false)
    private TipoAnimal tipoAnimal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

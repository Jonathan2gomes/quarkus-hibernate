package com.solutions.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pessoa", schema = "padrao")
public class Pessoa extends PanacheEntityBase {

    @Id
    @Column(name = "id_pessoa")
    private Long id;

    @Column(name = "primeiro_nome", length = 50, nullable = false)
    private String nome;

    @Column(name = "cpf", length = 11, nullable = false)
    private String cpf;

    @Column(name = "idade")
    private Integer idade;

    @ManyToMany
    @JoinTable(
            name="donos_pet",
            schema = "padrao",
            joinColumns=
            @JoinColumn(name="id_pessoa", referencedColumnName="id_pessoa"),
            inverseJoinColumns=
            @JoinColumn(name="id_pet", referencedColumnName="id_pet")
    )
    private List<Pet> pets;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }



    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
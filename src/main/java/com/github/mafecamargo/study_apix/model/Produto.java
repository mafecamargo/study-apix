package com.github.mafecamargo.study_apix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue
    
    // atributos são sempre private 
    private Long id;
    private String nome;

    // get e setters -> métodos que ficam públicos (encapsulamento)
    // pode consultar mas não podem alterar

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}

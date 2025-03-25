package com.github.mafecamargo.study_apix.model;

public class Produto {
    // atribtos são sempre private 
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

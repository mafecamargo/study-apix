package com.github.mafecamargo.study_apix.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.mafecamargo.study_apix.model.Produto;

@Service
public class ProdutoService {
// responsável por conversar com o banco de dados

    // simulação com uma tabela
    private List<Produto> produtos = new ArrayList<>();
    private Long id = 1L;


    public Produto save(Produto request) {

        request.setId(id++);
        produtos.add(request);
        return request;
    }

}

package com.github.mafecamargo.study_apix.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.mafecamargo.study_apix.dto.ProdutoRequestCreate;
import com.github.mafecamargo.study_apix.model.Produto;
import com.github.mafecamargo.study_apix.repository.ProdutoRepository;

@Service
public class ProdutoService {
// responsável por conversar com o banco de dados
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(ProdutoRequestCreate dto) {
        Produto produto = new Produto();
        produto.setNome(dto.getNome());

        return produtoRepository.save(produto);
    }

}

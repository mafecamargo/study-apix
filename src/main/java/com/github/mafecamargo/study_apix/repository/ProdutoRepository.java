package com.github.mafecamargo.study_apix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.mafecamargo.study_apix.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

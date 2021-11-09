package com.generation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByProdutoContainingInorecase(String produto);

}

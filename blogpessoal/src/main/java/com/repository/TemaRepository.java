package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Tema;

public interface TemaRepository extends JpaRepository< Tema, Long>{
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao); // ira pegar tudo que for igual a descricao ignorando letras maiuscuals e minusculas
	
}

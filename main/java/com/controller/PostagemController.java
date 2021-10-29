package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Postagem;
import com.repository.PostagemRepository;

@RestController
@RequestMapping(name = "/postagem")
@CrossOrigin("*")
public class PostagemController {

		@Autowired
		private PostagemRepository repository;
		
		@GetMapping
		public ResponseEntity<List<Postagem>> GetAll(){
			return ResponseEntity.ok(repository.findAll());//METODO PARA LISTAR AS PONSTAGES
			
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Postagem> getById(@PathVariable long id){ //getById(@PathVariable long id){ _> do tipo responseentity porque responde a requisiçao 
			return postagemRepository.findById(id)
					.map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
							
		}
}

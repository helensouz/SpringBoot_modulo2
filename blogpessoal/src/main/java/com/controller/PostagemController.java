package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		public ResponseEntity<Postagem> GetById(@PathVariable long id){ //getById(@PathVariable long id){ _> do tipo responseentity porque responde a requisiçao 
			return repository.findById(id)
					.map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
							
		}
		//ira listar todas as postagens 
		@GetMapping("/titulo/{titulo}")
		public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
			return ResponseEntity.ok(repository.findAllByTituloContainingInorecase(titulo));
		}
		
		//criando um novo objeto, uma nova postagem
		@PostMapping
		public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
					
		}
		
		//esta editando ou atualizando
		@PutMapping 
		public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem)); 
					
		}
		
		
		@DeleteMapping("/{id}")
		public void delete(@PathVariable long id) { //nao ira mostrar nada para o usuario
			repository.deleteById(id); //metodo de delete 
		}
		
		
		
		
}

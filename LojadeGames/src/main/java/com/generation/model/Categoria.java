package com.generation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@ManyToOne
		@JsonIgnoreProperties("categoria")
		@NotBlank
		@Size(min = 1, max = 25, message = "O nome do game deve ter no mínimo 1 e no máximo 25 caracteres ")
		private String NomeGame;
		
		@NotBlank(message = "O atributo não pode ser nulo")
		@Size(min = 1, max = 25, message = "O nome do personagem deve ter no mínimo 1 e no máximo 25 números")
		private String NomePersonagem;
		
		@NotBlank(message = "O atributo não pode ser nulo")
		@Size(min = 5, max = 25, message = "O nome da skin deve ter no mínimo 1 e no máximo 25 caracteres ")
		private String Skin;
		
		@NotBlank(message = "O atributo não pode ser nulo")
		@Size(min = 1, max = 10, message = "A força de ataque deve ter no mínimo 1 e no máximo 25 caracteres ")
		private int ForcaAtaque;
		
		@NotBlank(message = "Este atributo não pode ser nulo")
		@Size(min = 1, max = 10, message = "O nome da força de ataque deve ter no mínimo 1 e no máximo 25 caracteres ")
		private String MelhorAtaque;
		
		@NotBlank(message = "Este valor não deve ser nulo") 
		private double precoGame;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNomeGame() {
			return NomeGame;
		}
		public void setNomeGame(String nomeGame) {
			NomeGame = nomeGame;
		}
		public String getNomePersonagem() {
			return NomePersonagem;
		}
		public void setNomePersonagem(String nomePersonagem) {
			NomePersonagem = nomePersonagem;
		}
		public String getSkin() {
			return Skin;
		}
		public void setSkin(String skin) {
			Skin = skin;
		}
		public int getForcaAtaque() {
			return ForcaAtaque;
		}
		public void setForcaAtaque(int forcaAtaque) {
			ForcaAtaque = forcaAtaque;
		}
		public String getMelhorAtaque() {
			return MelhorAtaque;
		}
		public void setMelhorAtaque(String melhorAtaque) {
			MelhorAtaque = melhorAtaque;
		}
		
		
		

}

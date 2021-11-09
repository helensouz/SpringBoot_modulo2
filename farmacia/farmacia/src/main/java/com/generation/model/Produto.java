package com.generation.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Este campo não deve ser nulo")
	private String remedio;
	
	@Size(min = 2, max = 5, message = "Quantidade mínima de remédios: 2, e o máximo: 5 remédios")
	@NotNull(message = "Este campo deve ser preenchido")
	private double preco;
	
	@NotNull(message = "Este campo deve ser preenchido")
	private String tipoDePublico;
	
	@Size(min = 1, max = 200, message = "Quantidade mínima de remédios: 1, e o máximo: 200 remédios")
	@NotNull(message = "Este campo deve ser preenchido")
	private int quantidadeRemedio;
	
	
	@OneToMany(mappedBy ="produto", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("produto")
	private Produto produto;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNomeRemedio() {
		return remedio;
	}
	public void setNomeRemedio(String nomeRemedio) {
		this.remedio = nomeRemedio;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipoDePublico() {
		return tipoDePublico;
	}
	public void setTipoDePublico(String tipoDePublico) {
		this.tipoDePublico = tipoDePublico;
	}
	public int getQuantidadeRemedio() {
		return quantidadeRemedio;
	}
	public void setQuantidadeRemedio(int quantidadeRemedio) {
		this.quantidadeRemedio = quantidadeRemedio;
	}
	
}

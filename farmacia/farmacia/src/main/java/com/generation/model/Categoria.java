package com.generation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Este valor deve ser preenchido")
	private String nomeFarmacia;
	

	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Categoria categoria;
	
	
	@NotBlank(message = "Este valor deve ser preenchido")
	private String tipoRemedio;

	@NotBlank(message = "Este valor deve ser preenchido")
	private String plataforma;
	
	@Size(min = 2, max = 5, message = "Este valor deve ser preenchido")
	@NotNull(message = "Este valor deve ser preenchido")
	private double valorMin;
	
	@Size(min = 2, max = 5)
	@NotNull(message = "Este valor deve ser preenchido")
	private double valorMax;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTipoRemedio() {
		return tipoRemedio;
	}
	public void setTipoRemedio(String tipoRemedio) {
		this.tipoRemedio = tipoRemedio;
	}
	
	public String getNomeFarmacia() {
		return nomeFarmacia;
	}
	public void setNomeFarmacia(String nomeFarmacia) {
		this.nomeFarmacia = nomeFarmacia;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public double getValorMin() {
		return valorMin;
	}
	public void setValorMin(double valorMin) {
		this.valorMin = valorMin;
	}
	public double getValorMax() {
		return valorMax;
	}
	public void setValorMax(double valorMax) {
		this.valorMax = valorMax;
	}
	
	
}

package com.gorila.apirestgorila.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//Esta classe será uma entidade do banco de dados
@Entity //mapenado como uma tabela do banco
@Table(name="TB_INVESTIMENTO")

public class Investimento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//atributos:
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //indica para o banco que ele vai criar automaticamente os ids
	private long id;
	
	@NotNull
	private String tipo;
	
	@NotNull
	private BigDecimal valor;
	
	@NotNull
	private Date data;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}

}

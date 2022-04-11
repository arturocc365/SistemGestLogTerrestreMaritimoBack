package com.arturo.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "transports")
public class transport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@Column(length = 8)
	private String identificacion; // placa oh flota
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="typet_id", nullable=true)
	private TypeTransport typeTransport;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public TypeTransport getTypeTransport() {
		return typeTransport;
	}

	public void setTypeTransport(TypeTransport typeTransport) {
		this.typeTransport = typeTransport;
	}
	
	
	
}

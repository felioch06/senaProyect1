package com.example.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table( name = "DEPENDENCIA" )
public class Dependencia implements Serializable{
	
	private static final long serialVersionUID = -6362794385792247263L;
	
	private int id;
	
	private String descripcion;
	
	private String cargo;
	
	private boolean estado;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name = "ID_DEPENDENCIA_PK", nullable = false )
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column( name = "DESCRIPCION", nullable = false )
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Column( name = "CARGO", nullable = false )
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Column( name = "ESTADO", nullable = false )
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
	return "Dependencia [id=" + id + ", descripcion=" + descripcion + ", cargo="
	+ cargo + ", estado=" + estado + "]";
	}
}

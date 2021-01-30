package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table( name = "ROL" )

public class Dependencia implements Serializable{
	
	private static final long serialVersionUID = -6362794385792247263L;
	
	private int id;
	
	private String descripcion;
	
	private String cargo;
	
	private boolean estado;
}

package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	  @Column(name = "nombreUsuario",nullable = false, unique = true)
	  private String nombreUsuario;
	    
	  @Column(name = "correoElectronico",nullable = false)
	  private String correoElectronico;
	    
	  @Column(name = "contrasena",nullable = false)
	  private String contrasena;
	  
	  @Column(name = "telefono",nullable = false)
	  private String telefono;

	  
	  public Usuario() {
		  
	  }
	  
	public Usuario(Long id, String nombreUsuario, String correoElectronico, String contrasena, String telefono) {
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.correoElectronico = correoElectronico;
		this.contrasena = contrasena;
		this.telefono = telefono;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	

}

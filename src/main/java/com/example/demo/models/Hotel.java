package com.example.demo.models;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Hotel")
public class Hotel {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",nullable = false, unique = true)
    private String nombre;
    
    @Column(name = "ciudad",nullable = false)
    private String ciudad;

    @Column(name = "direccion",nullable = false,unique = true)
    private String direccion;
    
    @Column(name = "estrellas",nullable = false)
    private Integer estrellas;
    
    @Column(name = "comodidades",nullable = false)
    private String comodidades;
    
    @Column(name = "imagenes")
    private String imagenes;
    
    @OneToMany(mappedBy = "hotel")
    private List<Habitacion> habitaciones;

	public Hotel() {
		
	}

	public Hotel(Long id, String nombre, String ciudad, String direccion, Integer estrellas, String comodidades,
			String imagenes) {
		
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.estrellas = estrellas;
		this.comodidades = comodidades;
		this.imagenes = imagenes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(Integer estrellas) {
		this.estrellas = estrellas;
	}

	public String getComodidades() {
		return comodidades;
	}

	public void setComodidades(String comodidades) {
		this.comodidades = comodidades;
	}

	public String getImagenes() {
		return imagenes;
	}

	public void setImagenes(String imagenes) {
		this.imagenes = imagenes;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
    
	

}





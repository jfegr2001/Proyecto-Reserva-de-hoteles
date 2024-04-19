package com.example.demo.models;
import jakarta.persistence.*;

@Entity
@Table(name = "Habitacion")
public class Habitacion {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name = "numeroHabitacion",nullable = false)
	private String numeroHabitacion;
	
	@Column(name = "tipoHabitacion",nullable = false)
    private String tipoHabitacion;
	
	@Column(name = "precioPorNoche",nullable = false)
    private double precioPorNoche;
	
	@Column(name = "disponibilidad",nullable = false)
    private String disponibilidad;
	
	@Column(name = "detallesComodidades",nullable = false)
    private String detallesComodidades;
	
	 @ManyToOne
	 @JoinColumn(name = "id_hotel", referencedColumnName = "id")
	    private Hotel hotel;

	public Habitacion() {

	}

	public Habitacion(Long id, String numeroHabitacion, String tipoHabitacion, double precioPorNoche,
			String disponibilidad, String detallesComodidades) {
		this.id = id;
		this.numeroHabitacion = numeroHabitacion;
		this.tipoHabitacion = tipoHabitacion;
		this.precioPorNoche = precioPorNoche;
		this.disponibilidad = disponibilidad;
		this.detallesComodidades = detallesComodidades;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(String numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getDetallesComodidades() {
		return detallesComodidades;
	}

	public void setDetallesComodidades(String detallesComodidades) {
		this.detallesComodidades = detallesComodidades;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
	
	
	
	
	
	
	
	
}

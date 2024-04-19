package com.example.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Habitacion;


@Repository
public interface IHabitacionRepository extends JpaRepository<Habitacion, Long> {

}

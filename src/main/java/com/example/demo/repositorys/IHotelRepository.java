package com.example.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Hotel;

@Repository
public interface IHotelRepository extends JpaRepository<Hotel, Long> {

}

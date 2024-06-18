package com.app.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.hotelbooking.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}

package com.app.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.hotelbooking.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, String> {

}

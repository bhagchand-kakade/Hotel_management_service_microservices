package com.app.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.hotelbooking.entity.Room;

public interface RoomRepository extends JpaRepository<Room, String> {

}

package com.fis.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.theatre.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer>{

}

package com.fis.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.theatre.model.Acts;

public interface ActsRepository extends JpaRepository<Acts, Integer> {

}

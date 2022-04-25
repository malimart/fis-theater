package com.fis.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.theatre.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}

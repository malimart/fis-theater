package com.fis.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.theatre.model.Scene;

public interface SceneRepository extends JpaRepository<Scene, Integer>{

}

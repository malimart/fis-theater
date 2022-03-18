package com.fis.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.theatre.model.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor, Integer>{

}

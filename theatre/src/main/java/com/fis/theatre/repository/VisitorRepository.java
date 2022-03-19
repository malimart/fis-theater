package com.fis.theatre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.theatre.model.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor, Integer>{

	List<Visitor> findByFirstnameOrLastname(String firstname, String lastname);
	//select * from Visitor where firstname like :firstname OR lastname like :lastname;
	
}

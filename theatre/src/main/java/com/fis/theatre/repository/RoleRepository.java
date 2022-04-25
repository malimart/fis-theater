package com.fis.theatre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.theatre.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	public List<Role> findByShowt_Name(String name);
}

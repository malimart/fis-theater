package com.fis.theatre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.theatre.model.Performance;

public interface PerformanceRepository extends JpaRepository<Performance, Integer>{

	List<Performance> findByShowt_Name(String name);
}

package com.fis.theatre.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.fis.theatre.model.Performance;

public interface PerformanceRepository extends JpaRepository<Performance, Integer>{

	List<Performance> findByShowt_Name(String name);
	
	@Transactional
	long deleteByDate(Date date);
}

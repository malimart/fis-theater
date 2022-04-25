package com.fis.theatre.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fis.theatre.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

	@Query("SELECT l FROM Location l INNER JOIN l.scene.performances p "
			+ "WHERE p.showt.name like :nameShow and p.date = :dateShow "
			+ "AND NOT EXISTS (SELECT t FROM Ticket t where t.location = l and t.performance=p)")
	List<Location> getAllLocationForADateAndShow(@Param("dateShow") Date dateShow, @Param("nameShow") String nameShow);
}

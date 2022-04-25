package com.fis.theatre.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.theatre.model.Location;
import com.fis.theatre.repository.LocationRepository;
import com.fis.theatre.web.dto.LocationDTO;

@Service
public class LocationService {

	@Autowired
	LocationRepository locationRepository;

	public List<LocationDTO> getFreeSeats(Date date, String name) {
		List<LocationDTO> returnList = new ArrayList<LocationDTO>();
		List<Location> locations = locationRepository.getAllLocationForADateAndShow(date, name);

		for (Location l : locations) {

			LocationDTO temp = new LocationDTO();
			temp.setSeatNumber(l.getSeatNumber());
			temp.setSeatRow(l.getSeatRow());
			temp.setSection(l.getSection());
			temp.setNameOfTheScene(l.getScene().getNaziv());

			returnList.add(temp);
		}

		return returnList;
	}
}

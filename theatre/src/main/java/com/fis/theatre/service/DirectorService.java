package com.fis.theatre.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.theatre.model.Director;
import com.fis.theatre.repository.DirectorRepository;
import com.fis.theatre.web.dto.DirectorDTO;

@Service
public class DirectorService {

	@Autowired
	DirectorRepository directorRepo;

	public List<DirectorDTO> getAll() {
		List<DirectorDTO> returnValue = new ArrayList<DirectorDTO>();
		List<Director> directors = directorRepo.findAll();

		for (Director director : directors) {
			DirectorDTO temp = new DirectorDTO();
			
			temp.setFirstname(director.getFirstName());
			temp.setLastname(director.getLastName());
			temp.setId(director.getIdDirector());
			
			returnValue.add(temp);
		}

		return returnValue;
	}
}

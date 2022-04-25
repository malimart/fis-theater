package com.fis.theatre.service;

import com.fis.theatre.model.Genre;
import com.fis.theatre.repository.GenreRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.theatre.web.dto.GenreDTO;

@Service
public class GenreService {

	@Autowired
	GenreRepository genreRepo;

	public List<GenreDTO> findAll() {
		List<GenreDTO> returnValue = new ArrayList<GenreDTO>();
		List<Genre> genres = genreRepo.findAll();

		for (Genre genre : genres) {
			GenreDTO temp = new GenreDTO();

			temp.setIdGenre(genre.getIdGenre());
			temp.setName(genre.getName());

			returnValue.add(temp);
		}

		return returnValue;
	}
}

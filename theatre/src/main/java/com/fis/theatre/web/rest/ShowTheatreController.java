package com.fis.theatre.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.theatre.service.ShowTheatreService;
import com.fis.theatre.web.dto.ShowDTO;

@RestController
public class ShowTheatreController {

	@Autowired
	ShowTheatreService showService;

	@RequestMapping("/show/getAllShowsForActor/{firstname}/{lastname}")
	public List<ShowDTO> getAllShowsForActor(@PathVariable String firstname, @PathVariable String lastname) {
		return showService.getAllShowsForAnActor(firstname, lastname);
	}
}

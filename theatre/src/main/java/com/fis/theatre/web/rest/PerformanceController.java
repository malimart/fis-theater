package com.fis.theatre.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.theatre.service.PerformanceService;
import com.fis.theatre.web.dto.PerformanceDateAndSceneNameDTO;
import com.sun.research.ws.wadl.HTTPMethods;

@RestController
public class PerformanceController {

	@Autowired
	PerformanceService performanceServis;

	@RequestMapping("/performance/date-and-scene/{name}")
	public ResponseEntity<List<PerformanceDateAndSceneNameDTO>> getPerformanceDateAndSceneName(@PathVariable String name) {
		try {
			return new ResponseEntity<>(performanceServis.getPerformanceDateAndSceneName(name), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

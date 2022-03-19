package com.fis.theatre.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.theatre.service.PerformanceService;
import com.fis.theatre.web.dto.PerformanceDateAndSceneNameDTO;

@RestController
public class PerformanceController {

	@Autowired
	PerformanceService performanceServis;

	@RequestMapping("/performance/date-and-scene/{name}")
	public List<PerformanceDateAndSceneNameDTO> getPerformanceDateAndSceneName(@PathVariable String name) {
		return performanceServis.getPerformanceDateAndSceneName(name);
	}
}

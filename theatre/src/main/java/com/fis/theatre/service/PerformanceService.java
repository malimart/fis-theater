package com.fis.theatre.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.theatre.model.Performance;
import com.fis.theatre.repository.PerformanceRepository;
import com.fis.theatre.web.dto.PerformanceDateAndSceneNameDTO;

@Service
public class PerformanceService {

	@Autowired
	PerformanceRepository performanceRepo;

	public List<PerformanceDateAndSceneNameDTO> getPerformanceDateAndSceneName(String name) {
		List<Performance> performances = performanceRepo.findByShowt_Name(name);

		List<PerformanceDateAndSceneNameDTO> returnList = new ArrayList<PerformanceDateAndSceneNameDTO>();

		for (Performance p : performances) {
			PerformanceDateAndSceneNameDTO temp = new PerformanceDateAndSceneNameDTO();
			temp.setDate(p.getDate());
			temp.setName(p.getScene().getNaziv());

			returnList.add(temp);
		}

		return returnList;
	}
}

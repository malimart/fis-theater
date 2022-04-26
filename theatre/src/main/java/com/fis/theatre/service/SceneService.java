package com.fis.theatre.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.theatre.model.Scene;
import com.fis.theatre.repository.SceneRepository;
import com.fis.theatre.web.dto.SceneDTO;

@Service
public class SceneService {

	@Autowired
	SceneRepository sceneRepo;
	
	public List<SceneDTO> getAll(){
		List<SceneDTO> returnValue = new ArrayList<SceneDTO>();
		List<Scene> scenes = sceneRepo.findAll();
		
		for (Scene scene : scenes) {
			SceneDTO temp = new SceneDTO();
			
			temp.setId(scene.getIdScene());
			temp.setName(scene.getNaziv());
			
			returnValue.add(temp);
		}
		
		return returnValue;
	}
}

package com.fis.theatre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.theatre.model.Actor;
import com.fis.theatre.repository.ActorRepository;
import com.fis.theatre.web.dto.ActorDTO;

@Service
public class ActorService {

	@Autowired
	ActorRepository actorRepository;
	
	public ActorDTO insertActor(ActorDTO actorDTO) {
		Actor actor = new Actor();
		actor.setFirstName(actorDTO.getFirstName());
		actor.setLastName(actorDTO.getLastName());
		
		Actor newActor = actorRepository.save(actor);
//		actor = actorRepository.save(actor);
		
		
		actorDTO.setIdActor(newActor.getIdActor());
//		actorDTO.setIdActor(actor.getIdActor());

		return actorDTO;
	}
}

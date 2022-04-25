package com.fis.theatre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.theatre.model.Actor;
import com.fis.theatre.model.Acts;
import com.fis.theatre.model.ActsInPerformance;
import com.fis.theatre.model.Performance;
import com.fis.theatre.model.Role;
import com.fis.theatre.repository.ActorRepository;
import com.fis.theatre.repository.ActsInPerformanceRepository;
import com.fis.theatre.repository.ActsRepository;
import com.fis.theatre.repository.PerformanceRepository;
import com.fis.theatre.repository.RoleRepository;
import com.fis.theatre.web.dto.ActorDTO;
import com.fis.theatre.web.dto.RoleActorDTO;

@Service
public class ActorService {

	@Autowired
	ActorRepository actorRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PerformanceRepository performanceRepository;

	@Autowired
	ActsRepository actsRepo;

	@Autowired
	ActsInPerformanceRepository ainRepo;

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

	public boolean saveActorRole(RoleActorDTO roleActorDTO) {

		Actor actor = actorRepository.findById(roleActorDTO.getActorId()).get();
		Role role = roleRepository.findById(roleActorDTO.getRoleId()).get();
		Performance performance = performanceRepository.findById(roleActorDTO.getPerformanceId()).get();

		Acts acts = new Acts();
		acts.setActor(actor);
		acts.setRole(role);

		actsRepo.save(acts);

		ActsInPerformance ain = new ActsInPerformance();
		ain.setPerformance(performance);
		ain.setActs(acts);

		ainRepo.save(ain);
		
		return true;
	}
}

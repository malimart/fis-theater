package com.fis.theatre.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.theatre.model.Visitor;
import com.fis.theatre.repository.VisitorRepository;
import com.fis.theatre.web.dto.VisitorDTO;

@Service
public class VisitorService {

	@Autowired
	VisitorRepository visitorRepo;

//	public Visitor insertVisitor(Visitor v) {
//		Visitor returnVisitor = visitorRepo.save(v);
//		return returnVisitor;
////		or simply
////		return visitorRepo.save(v);;
//	}

	public VisitorDTO insertVisitor(VisitorDTO v) {

		Visitor visitor = new Visitor();
		visitor.setFirstname(v.getFirstname());
		visitor.setLastname(v.getLastname());

		Visitor returnVisitor = visitorRepo.save(visitor);

		VisitorDTO newDTOVisitor = new VisitorDTO();
		newDTOVisitor.setFirstname(returnVisitor.getFirstname());
		newDTOVisitor.setLastname(returnVisitor.getLastname());
		newDTOVisitor.setVisitorId(returnVisitor.getIdVisitor());

		return newDTOVisitor;
//		or simply
//		return visitorRepo.save(v);;
	}

//	public List<Visitor> getAll() {
//		return visitorRepo.findAll();
//	}
	
	public List<VisitorDTO> getAll() {
		List<Visitor> visitors = visitorRepo.findAll();
		List<VisitorDTO> visitorDTOs = new ArrayList<VisitorDTO>();
		for(Visitor v : visitors) {
			VisitorDTO vDTO = new VisitorDTO();
			vDTO.setFirstname(v.getFirstname());
			vDTO.setLastname(v.getLastname());
			vDTO.setVisitorId(v.getIdVisitor());
			visitorDTOs.add(vDTO);
		}
		return visitorDTOs;
	}
}

package com.fis.theatre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.theatre.model.Visitor;
import com.fis.theatre.repository.VisitorRepository;

@Service
public class VisitorService {

	@Autowired
	VisitorRepository visitorRepo;

	public Visitor insertVisitor(Visitor v) {
		Visitor returnVisitor = visitorRepo.save(v);
		return returnVisitor;
//		or simply
//		return visitorRepo.save(v);;
	}
}

package com.fis.theatre.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fis.theatre.model.Visitor;
import com.fis.theatre.service.VisitorService;

@RestController
public class VisitorController {

	@Autowired
	VisitorService visitorService;
	
	@RequestMapping(value = "/visitor/save", method = RequestMethod.POST)
	public Visitor saveVisitor(@RequestBody Visitor v) {
		Visitor newVisitor =  visitorService.insertVisitor(v);
		return newVisitor;
		
//		return visitorService.insertVisitor(v);
	}
}

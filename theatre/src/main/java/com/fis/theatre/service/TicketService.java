package com.fis.theatre.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.theatre.model.Location;
import com.fis.theatre.model.Performance;
import com.fis.theatre.model.Ticket;
import com.fis.theatre.model.Visitor;
import com.fis.theatre.repository.LocationRepository;
import com.fis.theatre.repository.PerformanceRepository;
import com.fis.theatre.repository.TicketRepository;
import com.fis.theatre.repository.VisitorRepository;
import com.fis.theatre.web.dto.TicketDTO;

@Service
public class TicketService {

	@Autowired
	TicketRepository ticketRepo;
	
	@Autowired
	PerformanceRepository performanceRepo;
	
	@Autowired
	VisitorRepository vistiorRepo;
	
	@Autowired
	LocationRepository locationRepo;
	
	public TicketDTO saveTicket(TicketDTO t) {
		
		Ticket ticket = new Ticket();
		ticket.setDatePayed(new Date());
		ticket.setDateReserved(new Date());
		ticket.setPrice(25.0);
				
		Performance perf = performanceRepo.getById(t.getIdPerformance());
		ticket.setPerformance(perf);
		
		Visitor visit = vistiorRepo.getById(t.getIdVisitor());
		ticket.setVisitor(visit);
		
		Location location = locationRepo.getById(t.getIdLocation());
		ticket.setLocation(location);
		
		ticket = ticketRepo.save(ticket);
		
		t.setIdTicket(ticket.getIdTicket());
		
		return t;
	}
}

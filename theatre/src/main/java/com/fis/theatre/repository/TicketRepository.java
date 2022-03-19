package com.fis.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.theatre.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}

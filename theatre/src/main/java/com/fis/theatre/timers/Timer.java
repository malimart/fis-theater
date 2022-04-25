package com.fis.theatre.timers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fis.theatre.repository.PerformanceRepository;

@Component
public class Timer {

	@Autowired
	PerformanceRepository showRepo;
	
	@Scheduled(cron = "0 54 17 * * *")
	public void reportCurrentTime() {
		

		LocalDate d = LocalDate.now();
		LocalDate newd = d.minusDays(10);
		ZoneId defaultZoneId = ZoneId.systemDefault();
		
		showRepo.deleteByDate(Date.from(newd.atStartOfDay(defaultZoneId).toInstant()));
		
		System.out.println("Hello");
	}
}

package com.poc.appinlogback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poc.appinlogback.service.Loggingchek;

@SpringBootApplication
public class AppinsightswithlogbackApplication implements CommandLineRunner {
	
	@Autowired
	Loggingchek loggingchek;

	public static void main(String[] args) {
		SpringApplication.run(AppinsightswithlogbackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		loggingchek.logback_appin();
		
	}

}

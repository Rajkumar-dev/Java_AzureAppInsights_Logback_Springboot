package com.poc.appinlogback.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.microsoft.applicationinsights.TelemetryClient;

@Service
public class Loggingcheckimpl implements Loggingchek {

	private static final Logger logger =  LoggerFactory.getLogger(Loggingcheckimpl.class);
	
	
	public void logback_appin() {
		logger.info("logback_appin_info");
	}
}

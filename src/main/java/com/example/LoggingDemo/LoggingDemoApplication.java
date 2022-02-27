package com.example.LoggingDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingDemoApplication implements ApplicationRunner {
	
	private static final Logger logger = LogManager.getLogger(LoggingDemoApplication.class);
	//private static final org.slf4j.Logger logger = LoggerFactory.getLogger(LoggingDemoApplication.class);

	public static void main(String[] args) {
		
		SpringApplication.run(LoggingDemoApplication.class, args);
		
	}
	
	@Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.trace("for tracing purpose");
        logger.fatal("Damn! Fatal error. Please fix me.");
    }

}

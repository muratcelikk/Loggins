package com.cal.loggins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogginsApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogginsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LogginsApplication.class, args);

        LOGGER.info("This is a log message !!!");
    }
}

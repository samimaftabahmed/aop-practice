package com.zaloni.samim.aoppractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopPracticeApplication.class, args);
        final String asyncLoggerProperty = "log4j2.contextSelector";
        final String asyncLoggerPropertyValue = "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector";
        System.setProperty(asyncLoggerProperty, asyncLoggerPropertyValue);
    }

}

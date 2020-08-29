package com.zaloni.samim.aoppractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final Logger log = LoggerFactory.getLogger(MyService.class);

    public String kibaService() {

        log.trace("A TRACE Message from MyService");
        log.debug("A DEBUG Message from MyService");
        log.info("An INFO Message from MyService");
        log.warn("A WARN Message from MyService");
        log.error("An ERROR Message from MyService");
        return "kiba-service";
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

}

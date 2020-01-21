package com.example.jibdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/")
    public String home() {
        logger.info("home homehomehomehomehomehomehomehomehomehomehomehomehomehomehomehomehome");
        // pre-java 8
        if (logger.isDebugEnabled()) {
            logger.debug("Hello from Log4j 2 - num ");
        }

        // java 8 lambda, no need to check log level
        logger.debug("Hello from Log4j 2 - num sadsadsads:");

        return "Welcome!";
    }

}
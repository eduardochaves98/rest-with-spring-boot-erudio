package br.com.edu.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;

@RestController
@RequestMapping("/api/test/v1")
public class TestLogController {

    private final Logger loggger = LoggerFactory.getLogger(TestLogController.class.getName());

    @GetMapping
    public String testLog() {
        loggger.info("This is an INFO log");
        loggger.warn("This is an WARN log");
        loggger.debug("This is an DEBUG log");
        loggger.error("This is an ERROR log");
        return "Test log";
    }
}

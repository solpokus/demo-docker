package com.example.docker.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class TestingResource {

    private final Logger log = LoggerFactory.getLogger(TestingResource.class);

    @GetMapping("/get")
    public ResponseEntity<?> getAllRetrieveList() {
        log.info("REST request to get a page of Retrieve List ");
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }
}

package com.example.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleRest {

    @GetMapping
    public ResponseEntity<String> getSample(){
        System.out.println("getSample clicked");
        return ResponseEntity.ok("hello hemant sahu");
    }
}

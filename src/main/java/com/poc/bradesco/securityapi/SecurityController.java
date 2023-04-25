package com.poc.bradesco.securityapi;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/security")
public class SecurityController {

    @GetMapping
    public ResponseEntity<Void> security() {
        return ResponseEntity.ok().build();
        
    }
    
}

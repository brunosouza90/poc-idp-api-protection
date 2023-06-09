package com.poc.bradesco.securityapi;


import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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

    /**
     * endpoint where the user has to have the role user
     */
    @GetMapping(value = "/has-role")
    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public ResponseEntity<Void> isUser() {
        return ResponseEntity.ok().build();
    }

    /**
     * endpoint where the user has to have the role admin
     */
    @GetMapping(value = "/is-admin")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public ResponseEntity<Void> isAdmin() {
        return ResponseEntity.ok().build();
    }
    
}

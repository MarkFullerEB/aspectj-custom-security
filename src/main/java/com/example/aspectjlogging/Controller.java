package com.example.aspectjlogging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

    @JWTSecurity("Admin")
    @GetMapping("/resource")
    public ResponseEntity<String> getResource(@RequestHeader HttpHeaders headers) {
        return ResponseEntity.ok(headers.toString() + " is allowed ");
    }
}

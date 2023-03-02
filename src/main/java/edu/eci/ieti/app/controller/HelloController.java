package edu.eci.ieti.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> GetResource() {
        return new ResponseEntity<>("Funciona. Santiago Fetecua", HttpStatus.ACCEPTED);
    }
}

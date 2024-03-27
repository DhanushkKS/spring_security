package org.dhanush.spring_security_test.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingsController {
    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("<h1>Hello</h1>");
    }

    @GetMapping("/good-bye")
    public ResponseEntity<String> sayGoodBye(){
        return new ResponseEntity<>("<h1>Good Bye</h1>",HttpStatus.OK);
    }
}

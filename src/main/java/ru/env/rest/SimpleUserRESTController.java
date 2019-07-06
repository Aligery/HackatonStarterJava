package ru.env.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.env.DTO.SimpleTestUser;
import ru.env.service.SimpleUserService;

import java.util.List;

@RestController
public class SimpleUserRESTController {

    @Autowired
    SimpleUserService simpleUserService;

    @RequestMapping(name = "/greetings", method = RequestMethod.GET)
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("Hello world!");
    }

//    @RequestMapping(name = "/getAllUsers", method = RequestMethod.GET)
//    public ResponseEntity<List<SimpleTestUser>> getAllUser() {
//        return ResponseEntity.ok(simpleUserService.getAllUsers());
//    }

}

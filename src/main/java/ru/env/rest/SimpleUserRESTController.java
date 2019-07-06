package ru.env.rest;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.env.DTO.SimpleTestUser;
import ru.env.DTO.UsersWithProducts;
import ru.env.service.SimpleUserService;

import java.util.List;

@RestController
public class SimpleUserRESTController {

    @Autowired
    SimpleUserService simpleUserService;

    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    @ApiOperation(value = "greetings", notes = "Hello Mr.Freeman")
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("Hello world brrrro!");
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    @ApiOperation(value = "get list of all users from DB", notes="Get All users from DB")
    public ResponseEntity<List<SimpleTestUser>> getAllUsers() {
        return ResponseEntity.ok(simpleUserService.getAllUsers());
    }

    @RequestMapping(value = "/getUsersAndProducts", method = RequestMethod.GET)
    @ApiOperation(value = "test test test", notes = "test test test")
    public ResponseEntity<List<UsersWithProducts>> getUsersWithProducts() {
        return ResponseEntity.ok(simpleUserService.getAllUsersWithProducts());
    }


}

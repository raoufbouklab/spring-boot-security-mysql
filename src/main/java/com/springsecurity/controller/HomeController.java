package com.springsecurity.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/bookstore/v1")
public class HomeController {

    @ApiOperation(value = "Home Page")
    @GetMapping(value = "/")
    public String hello(){
        return "Hello Everyone";
    }

    @ApiOperation(value = "User Page")
    @GetMapping("/user")
    public String userAccess() {
        return "User Content.";
    }

    @ApiOperation(value = "Moderator Page")
    @GetMapping("/mod")
    public String moderatorAccess() {
        return "Moderator Board.";
    }

    @ApiOperation(value = "Admin Page")
    @GetMapping("/admin")
    public String adminAccess() {
        return "Admin Board.";
    }
}

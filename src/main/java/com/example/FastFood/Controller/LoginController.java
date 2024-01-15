package com.example.FastFood.Controller;

import com.example.FastFood.DTO.userDTO;
import com.example.FastFood.Reponsetory.UserInterface;
import com.example.FastFood.Service.LoginService;
import com.example.FastFood.entity.Users;
import jdk.jshell.Snippet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping("/signin")
    public ResponseEntity<?> signin(){


        return new ResponseEntity<>(loginService.getAllUser(), HttpStatus.OK);
    }
}

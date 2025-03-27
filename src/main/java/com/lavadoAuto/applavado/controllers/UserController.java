package com.lavadoAuto.applavado.controllers;


import com.lavadoAuto.applavado.entities.User;
import com.lavadoAuto.applavado.entities.createUserDTO;
import com.lavadoAuto.applavado.services.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    ServiceUser serviceUser;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return serviceUser.getUsers();
    }

    @PostMapping("/create")
    public User create(@RequestBody createUserDTO user){
        return serviceUser.createUser(user);
    }

}

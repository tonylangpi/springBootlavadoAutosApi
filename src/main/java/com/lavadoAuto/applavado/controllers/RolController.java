package com.lavadoAuto.applavado.controllers;


import com.lavadoAuto.applavado.entities.Rol;
import com.lavadoAuto.applavado.services.ServiceRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Rol")
public class RolController {

    @Autowired
    ServiceRol serviceRol;


    @GetMapping("/all")
    public List<Rol> getAll(){
        return serviceRol.getRols();
    }

    @GetMapping("/byID/{id}")
    public Rol getRolByID(@PathVariable Long id){
        return serviceRol.getRolByID(id);
    }
}

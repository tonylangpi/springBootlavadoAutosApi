package com.lavadoAuto.applavado.services;


import com.lavadoAuto.applavado.entities.Rol;
import com.lavadoAuto.applavado.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceRolJPA implements ServiceRol {
    @Autowired
    RolRepository rolRepository;

    public List<Rol> getRols(){
        return rolRepository.findAll();
    }

    public Rol getRolByID(Long Id){
        Optional<Rol> rol = rolRepository.findById(Id);
        return rol.orElse(null);
    }

}

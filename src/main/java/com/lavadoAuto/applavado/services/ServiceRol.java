package com.lavadoAuto.applavado.services;

import com.lavadoAuto.applavado.entities.Rol;

import java.util.List;
import java.util.Optional;

public interface ServiceRol {

    List<Rol> getRols();
    Rol getRolByID(Long Id);
}

package com.lavadoAuto.applavado.services;


import com.lavadoAuto.applavado.entities.User;
import com.lavadoAuto.applavado.entities.createUserDTO;

import java.util.List;
import java.util.Optional;

public interface ServiceUser {

    User createUser(createUserDTO adminUser);
    List<User> getUsers();
}

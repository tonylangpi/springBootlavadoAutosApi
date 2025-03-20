package com.lavadoAuto.applavado.services;


import com.lavadoAuto.applavado.entities.Rol;
import com.lavadoAuto.applavado.entities.User;
import com.lavadoAuto.applavado.entities.createUserDTO;
import com.lavadoAuto.applavado.repositories.RolRepository;
import com.lavadoAuto.applavado.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lavadoAuto.applavado.utils.EncriptPassword;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceUserJPA implements ServiceUser {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ServiceRol serviceRol;


    @Transactional
    public User createUser(createUserDTO userAdmin){
        //String encryptedPass = EncriptPassword.encryptPassword(userAdmin.password);
        //userAdmin.password = encryptedPass;
        if(getUserByEmail(userAdmin.email) == null){
            // Buscar el rol por ID
            var rol = serviceRol.getRolByID(userAdmin.rolId);
            if(rol == null){
                return null;
            }else {
                User user = new User();
                user.name = userAdmin.name;
                user.lastName = userAdmin.lastName;
                user.email = userAdmin.email;
                user.password = EncriptPassword.encryptPassword(userAdmin.password); // Encriptar
                user.roles = rol; // Asignar el rol
                return userRepository.save(user);
            }
        }else{
            return null;
        }
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUserByEmail(String email){
        Optional<User> user = userRepository.findByEmail(email);
        return user.orElse(null);
    }

}

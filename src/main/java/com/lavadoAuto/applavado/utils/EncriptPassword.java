package com.lavadoAuto.applavado.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class EncriptPassword {

    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    //Método para encriptar una contraseña
    public static String encryptPassword(String password) {
        return passwordEncoder.encode(password);
    }

    //Método para verificar si la contraseña ingresada coincide con la encriptada
    public static boolean verifyPassword(String rawPassword, String encryptedPassword) {
        return passwordEncoder.matches(rawPassword, encryptedPassword);
    }
}

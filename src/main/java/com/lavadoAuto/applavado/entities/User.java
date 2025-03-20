package com.lavadoAuto.applavado.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    @Column(name = "last_name")
    public String lastName;
    public String email;
    public String password;
    @ManyToOne(targetEntity = Rol.class)
    @JoinColumn(name = "roles_id", referencedColumnName = "id")
    public Rol roles;
    @OneToMany(targetEntity = Service.class, fetch = FetchType.LAZY, mappedBy = "users")
    public List<Service> services;

}

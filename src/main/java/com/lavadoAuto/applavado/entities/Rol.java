package com.lavadoAuto.applavado.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = "Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "is_admin")
    private Boolean isAdmin;
    @OneToMany(targetEntity = User.class, fetch = FetchType.LAZY, mappedBy = "roles")
    @JsonIgnore
    private List<User> users;
}

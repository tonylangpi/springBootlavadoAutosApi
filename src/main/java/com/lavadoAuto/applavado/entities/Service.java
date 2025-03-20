package com.lavadoAuto.applavado.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name= "description", columnDefinition = "varchar(250)")
    private String description;
    private Double cost;
    @Column(name="date_create", columnDefinition = "DATE", updatable = false)
    @CreationTimestamp
    private LocalDate dateCreate;
    private Boolean status;
    @ManyToOne(targetEntity = User.class)
    private User users;


}

package com.lavadoAuto.applavado.persistence.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "permissions")
public class PermissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, updatable = false)
    public String name;

    // Constructor manual para Builder
    public static PermissionEntity create(String name) {
        PermissionEntity permission = new PermissionEntity();
        permission.name = name;
        return permission;
    }
}

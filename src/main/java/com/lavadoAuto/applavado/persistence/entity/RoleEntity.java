package com.lavadoAuto.applavado.persistence.entity;
import jakarta.persistence.*;
import lombok.*;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "role_name")
    @Enumerated(EnumType.STRING)
    public RoleEnum roleEnum;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "role_permissions", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "permission_id"))
    public Set<PermissionEntity> permissionList = new HashSet<>();

    // 🔹 Constructor Manual
    public RoleEntity(RoleEnum roleEnum, Set<PermissionEntity> permissionList) {
        this.roleEnum = roleEnum;
        this.permissionList = permissionList;
    }

    public Set<PermissionEntity> getPermissionList() {
        return permissionList;
    }

}
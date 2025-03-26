package com.lavadoAuto.applavado.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private String password;

    @Column(name = "is_enabled")
    private boolean isEnabled;

    @Column(name = "account_No_Expired")
    private boolean accountNoExpired;

    @Column(name = "account_No_Locked")
    private boolean accountNoLocked;

    @Column(name = "credential_No_Expired")
    private boolean credentialNoExpired;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleEntity> roles = new HashSet<>();

    // 🔹 Constructor Manual
    public UserEntity(String username,String password, boolean isEnabled, boolean accountNoExpired, boolean accountNoLocked, boolean credentialNoExpired, Set<RoleEntity> roles) {
        this.username = username;
        this.password = password;
        this.accountNoExpired = accountNoExpired;
        this.accountNoLocked = accountNoLocked;
        this.credentialNoExpired = credentialNoExpired;
        this.roles = roles;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public boolean isEnabled(){
        return isEnabled;
    }

    public boolean isAccountNoExpired(){
        return accountNoExpired;
    }

    public boolean isCredentialNoExpired(){
        return credentialNoExpired;
    }

    public boolean isAccountNoLocked(){
        return accountNoLocked;
    }



}
package com.lavadoAuto.applavado.repositorySecurity;

import com.lavadoAuto.applavado.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepositorySecure extends CrudRepository<UserEntity,Long> {

    Optional<UserEntity> findUserEntityByUsername(String username);
}

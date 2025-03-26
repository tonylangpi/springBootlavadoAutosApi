package com.lavadoAuto.applavado;

import com.lavadoAuto.applavado.persistence.entity.PermissionEntity;
import com.lavadoAuto.applavado.persistence.entity.RoleEntity;
import com.lavadoAuto.applavado.persistence.entity.RoleEnum;
import com.lavadoAuto.applavado.persistence.entity.UserEntity;
import com.lavadoAuto.applavado.repositorySecurity.UserRepositorySecure;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class ApplavadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplavadoApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(UserRepositorySecure userRepository) {
//		return args -> {
//			/* Create PERMISSIONS */
//			PermissionEntity createPermission = PermissionEntity.create("CREATE");
//
//			PermissionEntity readPermission = PermissionEntity.create("READ");
//
//			PermissionEntity updatePermission = PermissionEntity.create("UPDATE");
//
//			PermissionEntity deletePermission = PermissionEntity.create("DELETE");
//
//			/* Create ROLES */
//			RoleEntity roleAdmin = new RoleEntity(RoleEnum.ADMIN, Set.of(createPermission, readPermission, updatePermission, deletePermission));
//
//			//RoleEntity roleUser = new RoleEntity(RoleEnum.USER, Set.of(createPermission, readPermission));
//			RoleEntity roleInvited = new RoleEntity(RoleEnum.INVITED, Set.of(readPermission));
//
//			RoleEntity roleDeveloper = new RoleEntity(RoleEnum.DEVELOPER, Set.of(createPermission, readPermission, updatePermission, deletePermission));
//
//			/* CREATE USERS */
//			UserEntity userToni = new UserEntity("toni", "1234", true,true,true,true,Set.of(roleAdmin));
//
//			UserEntity userDaniel = new UserEntity("daniel", "12345", true, true, true, true, Set.of(roleInvited));
//			userRepository.saveAll(List.of(userToni, userDaniel));
//		};
//	}

}

package com.ksdc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ksdc.entity.Roles;

public interface RolesRepo extends JpaRepository<Roles, Long> {
	 @Query("SELECT r FROM Roles r JOIN r.roleNames rn WHERE rn IN :roleNames")
	    List<Roles> findRolesByNames(@Param("roleNames") List<String> roleNames);
}

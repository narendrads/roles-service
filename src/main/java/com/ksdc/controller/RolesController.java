package com.ksdc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ksdc.entity.Roles;
import com.ksdc.service.RolesService;

@RestController
@RequestMapping("/api/roles")
public class RolesController {

	@Autowired
	private RolesService rolesService;
	
	@PostMapping("/register")
public Roles registerRole(@RequestBody Roles roles) {
		return rolesService.registerRole(roles);
	}
	
	 @PostMapping("/validate")
	    public List<String> validateRoles(@RequestBody List<String> roleNames) {
	        return rolesService.validateRoles(roleNames);
	    }
}

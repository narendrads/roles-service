package com.ksdc.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksdc.entity.Roles;
import com.ksdc.repository.RolesRepo;
import com.ksdc.service.RolesService;
@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	private RolesRepo repo;
	@Override
	public Roles registerRole(Roles roles) {
		
		return repo.save(roles);
	}
	
	public List<String> validateRoles(List<String> roleNames) {
        List<Roles> matchedRoles = repo.findRolesByNames(roleNames);
        return matchedRoles.stream()
                           .flatMap(r -> r.getRoleNames().stream())
                           .distinct()
                           .collect(Collectors.toList());
    }

}

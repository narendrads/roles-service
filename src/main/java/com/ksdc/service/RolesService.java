package com.ksdc.service;

import java.util.List;

import com.ksdc.entity.Roles;

public interface RolesService {
public Roles registerRole(Roles roles);
public List<String> validateRoles(List<String> roleNames);
}

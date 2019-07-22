package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRoleCode(String roleCode);
}

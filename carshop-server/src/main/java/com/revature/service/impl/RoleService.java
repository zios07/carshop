package com.revature.service.impl;

import com.revature.dao.RoleRepository;
import com.revature.dao.UserRepository;
import com.revature.entity.Role;
import com.revature.entity.User;
import com.revature.service.IRoleService;
import com.revature.service.exception.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.revature.util.UtilContants.ROLE_CODE_ADMIN;
import static com.revature.util.UtilContants.ROLE_CODE_USER;

@Service
public class RoleService implements IRoleService {
	
	@Autowired
	private RoleRepository repo;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Role findRoleByUsername(String username) throws ServiceException {
		User user = userRepository.findByAccountUsername(username);
		if(user == null)
			throw new ServiceException("INVALID.USERNAME", "Invalid username");
		
		return user.getRole();
	}

	@Override
	public Role findById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Role> findAll() {
		return repo.findAll();
	}

	@Override
	public Role getRoleUser() {
		return repo.findByRoleCode(ROLE_CODE_USER);
	}

	@Override
	public Role getRoleAdmin() {
		return repo.findByRoleCode(ROLE_CODE_ADMIN);
	}

}

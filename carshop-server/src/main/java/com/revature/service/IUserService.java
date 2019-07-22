package com.revature.service;

import com.revature.dto.ProfileDTO;
import com.revature.entity.User;
import com.revature.exception.NotFoundException;
import com.revature.exception.ServiceException;

import java.util.List;

public interface IUserService {
	
	User addUser(User user) throws ServiceException;

	User findUser(long id) throws NotFoundException;

	List<User> findAllUsers();

	void deleteUser(long id) throws NotFoundException;

	List<User> searchUsers(User userDto) throws NotFoundException;

	User updateUser(User user) throws NotFoundException;
	
	User findUserByUsername(String username) throws NotFoundException;

	User getConnectedUser() throws NotFoundException;

    User updateUserProfile(ProfileDTO user);

    User getUserByUsername(String username);
}

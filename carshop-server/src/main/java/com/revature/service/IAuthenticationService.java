package com.revature.service;

import com.revature.entity.Account;
import com.revature.service.exception.BadCredentialsException;
import com.revature.service.exception.NotFoundException;

public interface IAuthenticationService {

	Account authenticate(Account account) throws NotFoundException, BadCredentialsException;
}

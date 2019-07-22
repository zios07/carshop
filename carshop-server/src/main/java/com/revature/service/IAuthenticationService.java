package com.revature.service;

import com.revature.entity.Account;
import com.revature.exception.BadCredentialsException;
import com.revature.exception.NotFoundException;

public interface IAuthenticationService {

	Account authenticate(Account account) throws NotFoundException, BadCredentialsException;
}

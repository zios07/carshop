package com.revature.service.impl;

import com.revature.dao.AccountRepository;
import com.revature.entity.Account;
import com.revature.service.IAuthenticationService;
import com.revature.service.exception.BadCredentialsException;
import com.revature.service.exception.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements IAuthenticationService {

	@Autowired 
	private AccountRepository accountRepo;
	
	@Override
	public Account authenticate(Account credentials) throws NotFoundException, BadCredentialsException {
		Account account = accountRepo.findByUsername(credentials.getUsername());
		if(account == null || (account.getPassword() != null && !account.getPassword().equals(credentials.getPassword())))
			throw new BadCredentialsException("AUTHENTICATION.ERROR", "Bad credentials");
		return account;
	}

}

package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByUsername(String username);

}

package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByAccountId(Long accountID);

	User findByAccountUsername(String username);

}

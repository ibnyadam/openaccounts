package com.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.accounts.beans.User;

public interface UserRepository extends JpaRepository<User, Long>{

	@Query("FROM User WHERE LOWER(username) = LOWER(:username)")
	public User findByUsername(@Param("username") String username);
	
	public User findByUsernameAndPassword(String username, String password);
}

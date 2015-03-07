package com.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accounts.beans.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}

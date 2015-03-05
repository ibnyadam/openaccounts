package com.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accounts.beans.Head;

@Repository
public interface HeadRepository extends JpaRepository<Head, Long>{

}

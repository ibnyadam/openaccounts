package com.accounts.valueobjects;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.accounts.beans.Role;

public class UserVO implements IValueObject{
	private Integer id;
	private String username;
	private String password;
	private Role role;
	private int createdby;
	private Date datecreated;
	private String email;
	private String firstname;
	private String lastname;
	private int status;
	
	public UserVO(){
		
	}
	
	public UserVO(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public UserVO(Integer id, String username, String password, Role role,
			int createdby, Date datecreated, String email, String firstname,
			String lastname, int status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.createdby = createdby;
		this.datecreated = datecreated;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getCreatedby() {
		return createdby;
	}

	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}

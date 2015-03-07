package com.accounts.valueobjects;

public class RoleVO implements IValueObject {
	
	private Integer id;
	private String role;
	
	public RoleVO(){
		
	}
	
	public RoleVO(Integer id, String role) {
		super();
		this.id = id;
		this.role = role;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}

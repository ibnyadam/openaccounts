package com.accounts.valueobjects;

import java.util.Date;

public class HeadVO implements IValueObject{
	private int id;
	private int createdby;
	private Date datecreated;
	private String description;
	private String name;
	private int parentId;
	private int status;
	
	public HeadVO(){
		super();
	}
	
	public HeadVO(int id, int createdby, Date datecreated, String description,
			String name, int parentId, int status) {
		super();
		this.id = id;
		this.createdby = createdby;
		this.datecreated = datecreated;
		this.description = description;
		this.name = name;
		this.parentId = parentId;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}

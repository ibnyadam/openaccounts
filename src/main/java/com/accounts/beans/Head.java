package com.accounts.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "head")
public class Head implements IEntityBean {
	
	private static final long serialVersionUID = 8295982670757466807L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	private int createdby;

	private Date datecreated;

	private String description;

	@Column(name = "name")
	private String name;
	
	@Column(name = "parent_id")
	private int parentId;

	private int status;

	public Head() {
	}
	
	

	public Head(int id, int createdby, Date datecreated, String description,
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
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}

	public Date getDatecreated() {
		return this.datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
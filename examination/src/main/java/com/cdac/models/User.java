package com.cdac.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String pass;
	@Id
	@Column(name="email")
	private String email;
	@Column(name="role")
	private String role;
	@Column(name="Institute_Name")
	private String instituteName;
	
	public User() {
		super();
	}

	public User(String name, String pass, String email, String role, String instituteName) {
		super();
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.role = role;
		this.instituteName = instituteName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", pass=" + pass + ", email=" + email + ", role=" + role + ", instituteName="
				+ instituteName + "]";
	}
	
	
	
	
	
}

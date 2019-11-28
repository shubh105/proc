package com.ranps.proc.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userregister")
public class UserRegistration {

	private String fname;
	private String lname;
	private String pass;
	private String cpass;
	@Id
	private String email;
	private String gender;
	private String role;
	private String instituteName;
	
	
	
	public UserRegistration() {
		super();
	}
	public UserRegistration(String fname, String lname, String pass, String cpass, String email, String gender,
			String role, String instituteName) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.pass = pass;
		this.cpass = cpass;
		this.email = email;
		this.gender = gender;
		this.role = role;
		this.instituteName = instituteName;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
		return "UserRegistration [fname=" + fname + ", lname=" + lname + ", pass=" + pass + ", cpass=" + cpass
				+ ", email=" + email + ", gender=" + gender + ", role=" + role + ", instituteName=" + instituteName
				+ "]";
	}
	
}

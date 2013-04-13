package com.leslie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements java.io.Serializable{
	private String  id;
	private String userName;
	private String Password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Id
	@GeneratedValue
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}

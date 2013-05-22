package com.corejsf;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String password;
	
	public User() {
		this("", "");
	}
	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String logout() {
		name = "";
		password = "";
		
		return "index";
	}
	
	public String login() {
		return "welcome";
	}
	
}

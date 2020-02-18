package com.lti.login;

public class User {
	
	private String password;
	private String username;
	private boolean allowed;
	
	public User() {
		
	}

	public User(String password, String username, boolean allowed) {
		
		this.password = password;
		this.username = username;
		this.allowed = allowed;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isAllowed() {
		return allowed;
	}

	public void setAllowed(boolean allowed) {
		this.allowed = allowed;
	}
	
	

}

package com.evesync.dataservice.api.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserPostDto {
	private int id;
	private String username;
	private String firstname;
	private String profileimg;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getProfileimg() {
		return profileimg;
	}
	public void setProfileimg(String profileimg) {
		this.profileimg = profileimg;
	}	
	
	
}
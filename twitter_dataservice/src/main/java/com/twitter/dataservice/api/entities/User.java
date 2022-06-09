package com.twitter.dataservice.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@Column(name = "id")
	Long id;

	@Column(name = "username")
	String username;

	@Column(name = "password")
	String password;

	@Column(name = "active")
	Boolean active;
}

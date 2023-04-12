package com.evesync.dataservice.api.entities;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="events")
public class Event {
	
	@Id
	@Column(name="id")
	int id;
	
	@Column(name = "title")
	String title;
	
	@Column(name="type")
	String type;
	
	@Column(name="location")
	String location;
	
	@Column(name = "img")
	String img;
	
	@Column(name = "description")
	String description;
	
	@Column(name = "likes")
	String likes;
	
	
	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDesc(String description) {
		this.description = description;
	}
	
	
}
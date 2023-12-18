package com.jsp.Entity;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@javax.persistence.Entity
@Component
public class Entity {

	@Id
	@Column(nullable = false,unique = true)
	private int id;
	private String name;
	@Column(nullable = false,unique =  true)
	private String email;
	private long number;
	private int age;
	private String gender;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", age=" + age
				+ ", gender=" + gender + ", role=" + role + "]";
	}
}

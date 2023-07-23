package com.springboot.learnjpahibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //->for declaring class as a entity in table
@Table(name="COURSE")//-> for mapping tables name in JPA to class
public class Course {
	
	@Id
	private long id;
	@Column(name="name") //-> for mapping columns in table in JPA
	private String name;
	@Column(name="author")
	private String author;

	public Course() {

	}

	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	// constructor
	// getters
	// toString

}
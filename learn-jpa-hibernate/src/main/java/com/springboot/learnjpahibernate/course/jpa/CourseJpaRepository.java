package com.springboot.learnjpahibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.springboot.learnjpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository //-> class with handles DB communications
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext //-> used for EntityManager
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}

	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}

}

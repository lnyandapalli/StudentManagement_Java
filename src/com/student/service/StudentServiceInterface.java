package com.student.service;

import com.student.model.Student;

public interface StudentServiceInterface {
	
	boolean add(Student s);
	boolean edit(Student s);
	boolean delete(int id);
	boolean view(int id);
	void viewAll();
}

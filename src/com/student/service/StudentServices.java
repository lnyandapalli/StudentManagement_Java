package com.student.service;

import com.student.model.Student;

public class StudentServices implements StudentServiceInterface{
	
	Student arr_s[] = new Student[100];
	
	public boolean add(Student s)
	{
		arr_s[Student.getNoofStudents()] = s;
		Student.IncStudent();
		return true;
	}
	
	public boolean edit(Student s) 
	{
		for(int  i = 0; i < Student.getNoofStudents(); i++) {
			if(arr_s[i].getSid() == s.getSid()) {
				arr_s[i] = s;
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(int id) {
		
		for(int  i = 0; i < Student.getNoofStudents(); i++) {
			if(arr_s[i].getSid() == id) {
				for(int j = i ; j < Student.getNoofStudents(); j++) {
					arr_s[j] = arr_s[i+1];
					i++;
				}
				Student.DecStudent();
				return true;
			}
		}
		return false;
	}

	
	public boolean view(int id) {
		for(int i = 0; i < Student.getNoofStudents(); i++) {
			if(arr_s[i].getSid() == id) {
				arr_s[i].display();
				return true;
			}
		}
		return false;
	}
	
	public void viewAll() {
		for(int i = 0; i<Student.getNoofStudents(); i++) {
			arr_s[i].display();
		}
	}
}

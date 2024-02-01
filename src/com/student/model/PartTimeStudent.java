package com.student.model;
public class PartTimeStudent extends Student{
	private int hours;
	
	public PartTimeStudent(int sid, String sname, int standard, char m1, char m2, int hours) {
		super(sid, sname, standard, m1, m2);
		this.hours = hours;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
}

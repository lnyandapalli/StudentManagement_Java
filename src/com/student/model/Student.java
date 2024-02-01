package com.student.model;

public class Student {
	private int sid;
	private String sname;
	private int standard;
	private char m1;
	private char m2;
	private static final String school = "Narayana";
	private static int NoofStudents = 0;

	public Student(int sid, String sname, int standard, char m1, char m2)
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.standard = standard;
		this.m1 = m1;
		this.m2 = m2;
	}
	

	public Student(int sid) {
		super();
		this.sid = sid;
	}
	
	public Student()
	{
		super();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public char getM1() {
		return m1;
	}

	public void setM1(char m1) {
		this.m1 = m1;
	}

	public char getM2() {
		return m2;
	}

	public void setM2(char m2) {
		this.m2 = m2;
	}

	public static String getSchool() {
		return school;
	}
	
	public static int getNoofStudents() {
		return NoofStudents;
	}

	public static void setNoofStudents(int noofStudents) {
		NoofStudents = noofStudents;
	}
	
	public static void IncStudent() {
		NoofStudents++;
	}
	
	public static void DecStudent() {
		NoofStudents--;
	}
	
	public void display() {
		System.out.println("Student [sid=" + sid + ", sname=" + sname + ", standard=" + standard + ", m1=" + m1 + ", m2=" + m2
				+ ", school=" + school + ", NoofStudents=" + NoofStudents + "]");
	}

}

package com.student.main;
import java.util.*; 

//import com.student.model.PartTimeStudent;
import com.student.model.Student;
import com.student.service.StudentServiceInterface;
import com.student.service.StudentServices;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		StudentServiceInterface ss = new StudentServices();
		
		do {
			System.out.println("Student Management Service Options: ");
			System.out.println("1. Add Student");
			System.out.println("2. Edit Student");
			System.out.println("3. Delete Student");
			System.out.println("4. View Student");
			System.out.println("5. View all Students");
			System.out.println("6. Get total number of Students");
			System.out.println("7. Exit Student Management application");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter student details: ");
				int temp_id = sc.nextInt();
				String temp_name = sc.next();
				int temp_std = sc.nextInt();
				char temp_m1 = sc.next().charAt(0);
				char temp_m2 = sc.next().charAt(0);
				
				Student s1 = new Student(temp_id, temp_name, temp_std, temp_m1, temp_m2);
				boolean res = ss.add(s1);
				
				if(res == true) {
					System.out.println("Student added succesfully");
				}
				else {
					System.out.println("Student is not added to the system");
				}
				break;
			
			case 2:
				
				System.out.println("Enter the student id to edit and the details");
				int temp_id1 = sc.nextInt();
				String temp_name1 = sc.next();
				int temp_std1 = sc.nextInt();
				char temp_m11 = sc.next().charAt(0);
				char temp_m21 = sc.next().charAt(0);
				Student s2 = new Student(temp_id1, temp_name1, temp_std1, temp_m11, temp_m21);
				boolean res1 = ss.edit(s2);
				
				if(res1 == true) {
					System.out.println("Student details edit successfull");
				}else {
					System.out.println("Unable to find student with the student id");
				}
				break;
				
			case 3:
				System.out.println("Enter the student id: ");
				int temp_id2 = sc.nextInt();
				boolean res2 = ss.delete(temp_id2);
				if(res2 == true) {
					System.out.println("Student is deleted from the system");
				}else {
					System.out.println("Unable to find student with the student id");
				}
				break;
				
			case 4:
				System.out.println("Enter the student id: ");
				int temp_id3 = sc.nextInt();
				boolean res3 = ss.view(temp_id3);
				if(res3 == false) {
					System.out.println("Unable to find student with the student id");
				}
				break;
				
			case 5:
				ss.viewAll();
				break;
			
			case 6:
				System.out.println(Student.getNoofStudents());
				break;
			}
			
			
		}while(choice != 7);
		
		System.out.println("Thanks for using Student Management System");
		
		sc.close();
	}

}

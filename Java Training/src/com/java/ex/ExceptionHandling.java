package com.java.ex;
import java.util.ArrayList;

class StudentNotFoundException extends Exception{
		
	public StudentNotFoundException(String message){
		super(message);
	}
}

class StudentManagementSystem {
	ArrayList<Integer> studentId;
	ArrayList<String> studentName;

	public StudentManagementSystem(ArrayList<Integer> studentId, ArrayList<String> studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public void displayInfo() throws StudentNotFoundException {
		for (int i = 0; i < studentId.size(); i++) {
			if (studentId.get(i) == 3) {
				throw new StudentNotFoundException("Student Not Found");
			} else {

				System.out.println("Student ID  : " + (i + 1) + " Name  : " + studentName.get(i));
			}
		}
	}

}

public class ExceptionHandling {
	public static void main(String[] args) throws StudentNotFoundException {

		ArrayList<Integer> studentIdList = new ArrayList<Integer>();
		studentIdList.add(1);
		studentIdList.add(2);
		studentIdList.add(3);

		ArrayList<String> studentNameList = new ArrayList<String>();
		studentNameList.add("Kanchan");
		studentNameList.add("Harsh");
		studentNameList.add("Minal");

		StudentManagementSystem managementSystem = new StudentManagementSystem(studentIdList, studentNameList);
		managementSystem.displayInfo();
		
		System.out.println("Class Started");
	}
}

package com.java.staticblock;

public class Student {

	static String collageName;
	int studentId;

	public static void main(String[] args) {
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		
		System.out.println("Student-1 ID : "+student1.getStudentId() +" |   CollageName : "+student1.getCollageName());
		System.out.println("Student-2 ID : "+student2.getStudentId() +" |   CollageName : "+student2.getCollageName());
		System.out.println("Student-3 ID : "+student3.getStudentId() +" |   CollageName : "+student3.getCollageName());
	}

	//instance
	public void setStudentId(int id) {
		studentId = id;
	}

	//static
	public static void setCollageName(String name) {
		collageName = name;
	}

	//instance
	public int getStudentId() {
		return studentId;
	}

	//static
	public static String getCollageName() {
		return collageName;
	}

}

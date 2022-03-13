package com.java.arr;

public class ArrayExample {

	public static void main(String[] args) {

		//task - print only first name
		String[] name= {"Rohit sharma" , "Raju varma" , "Mohit Patel"};
		
		// 1st way -- print
		int[] studentIds = { 101, 102, 103, 104, 105, 106 };

		// 2nd way -- assignment
		int[] studentIds2 = new int[6];
		// enter array data
		studentIds2[0] = 101;
		studentIds2[1] = 102;
		studentIds2[2] = 103;
		studentIds2[3] = 104;
		studentIds2[4] = 105;
		studentIds2[5] = 106;

		// int val=studentIds[0];

		// System.out.println(studentIds[0]);
		// System.out.println(studentIds[1]);
		// System.out.println(studentIds[2]);
		// System.out.println(studentIds[3]);
		// System.out.println(studentIds[4]);
		// System.out.println(studentIds[5]);
		// System.out.println(studentIds[7]);

		// loop controls
		// while - do while - for

		System.out.println("Length of array : "+studentIds.length);
		
		for (int index = 0; index < studentIds.length; index++) {
			System.out.println(studentIds[index]);
			//some logic
		}
		
		//step -1 array iteration
		// some logic
		for(int index = 0;index<name.length;index++) {		//index=0	0+1=1
			//some logic
			String fullName=name[index];					//fullname  -- >name[0] --> Rohit Sharma
			String[] fullNameArr=fullName.split(" ");		// fullNameArr[0] - Rohit  fullNameArr[1]- Sharma 
			System.out.println(fullNameArr[0]);				//Rohit
		}
		
		System.out.println("Printing through While Loop ***********");
		int ind=0;
		while(ind<studentIds.length) {					//ind ==0  |  studentIds.length--> 6
			System.out.println(studentIds[ind]);
			ind++;
		}
		

	}

	//method can instance /static 
	//araay -- as a parameter
	public void print(int[] val) {
		
	}
	
	//method with return type 
	
	public String[] getStudentNames(int[] studenytIds) {
			//somelogic
		
		//input == int [] -- student Ids
		
		//return studentName[];
		return null;
		
	}
	
	
	
}

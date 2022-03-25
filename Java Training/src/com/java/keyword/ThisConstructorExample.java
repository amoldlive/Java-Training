package com.java.keyword;

class Softronix{
	private String studentName;
	private int studentId;
	private int fees;
	
	public Softronix(String studentName, int studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
	}

	
	
	public Softronix(String studentName, int studentId, int fees) {
		this(studentName, studentId);
		this.fees = fees;
	}



	@Override
	public String toString() {
		return "Softronix [studentName=" + studentName + ", studentId=" + studentId + ", fees=" + fees + "]";
	}



	
		
	
}
public class ThisConstructorExample {
		public static void main(String[] args) {
			
			Softronix softronix=new Softronix("Salman", 1,5000);
			System.out.println(softronix.toString());
			
		}
}

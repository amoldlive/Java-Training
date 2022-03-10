package com.java.keyword;

public class ThisExample {

	int id;
	
	public static void main(String[] args) {
		ThisExample obj=new ThisExample();
		//obj.setId(10);
		System.out.println("ID : "+ obj.getId());
	}
	
	public void setId(int id) {
		id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void printDetails() {
		System.out.println("ID : "+this.getId());
	}
	
}

package com.java.keyword;

class Test {
	
	Test2 test2;
	
	public Test(Test2 test2){
		this.test2=test2;
	}
	
	public void print() {
		System.out.println("Test Data : "+test2.id);
	}
}

class Test2 {
	int id;
	
	Test2(int id ){
		this.id=id;
		Test test=new Test(this);
		test.print();
	}

}

public class ThisConstructorParamExample {
	public static void main(String[] args) {
		Test2 test2=new Test2(14);
	}
}

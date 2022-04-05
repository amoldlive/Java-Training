package com.java.oops;

interface A {
	public void show();
}

interface B {
	public void show();
}

class C implements A,B {

	@Override
	public void show() {
		System.out.println("My Implementation");
		
	}

}

public class InterfaceExample2 {
	public static void main(String[] args) {
		C obj=new C();
		obj.show();
	}
}

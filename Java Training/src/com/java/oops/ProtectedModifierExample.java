package com.java.oops;

import com.java.oops.def.MyInfo3;

public class ProtectedModifierExample extends MyInfo3 {
	
	public static void main(String[] args) {
		
		//MyInfo3 info3=new MyInfo3();
		//info3.printName();
		
		ProtectedModifierExample obj=new ProtectedModifierExample();
		obj.printName();
	}
}	

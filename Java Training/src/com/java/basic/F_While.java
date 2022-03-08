package com.java.basic;

/*loop*/
/*infinite loop*/
public class F_While {

	public static void main(String[] args) {
		
		//print values from 1 to 10
		int val=1;
		

		while(val<=10) {
			System.out.println(val);
			val++;
			
			//conditional breaking
			if(val>3) {
				break;
			}
		}	
		
	}
}

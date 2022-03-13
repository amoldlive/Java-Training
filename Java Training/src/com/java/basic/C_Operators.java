package com.java.basic;

/*
Arithmetic Operators  [~ , !]
Relational Operators  [instanceOf]
Assignment Operators
Logical Operators [if else]
Conditional/Ternary Operators [if else]
Bitwise Operators [last]
 */
public class C_Operators {
	public static void main(String[] args) {
		
		//object creation
		//ArithmaticOperators arithmaticOperators=new ArithmaticOperators();
		//arithmaticOperators.show();
		
		//RelationalOperators relationalOperators =new RelationalOperators();
		//relationalOperators.show();
		
		//AssignmentOperator assignmentOperator=new AssignmentOperator();
		//assignmentOperator.show();
		
		TernaryOperator ternaryOperator=new TernaryOperator();
		ternaryOperator.show(10, 20);
	}
}

class ArithmaticOperators {
	/*
	+ (Addition)		
	- (Subtraction)	
	* (Multiplication)	
	/ (Division)		
	% (Modulus)			
	++ (Increment)		
	-- (Decrement) 	
	*/
	
	int num1=100;
	int num2=10;
	
	public void show() {
		System.out.println("Addition "+ (num1+num2)); //110
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		System.out.println(num1%num2);//0
		
		System.out.println(num1++); //num1=num1+1  // 
		System.out.println(++num1);
		
		System.out.println(num1--);  //num1=num-1   //postfix
		System.out.println(--num1);  //prefix
		
		
	}
	
}



class RelationalOperators{
	/*
			== (equal to)								
			!= (not equal to)	
			> (greater than)	
			< (less than)	
			>= (greater than or equal to)	
			<= (less than or equal to)
	*/
	int num1=100;
	int num2=10;
	public void show() {
		
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		
	}
}

class AssignmentOperator{
	
	/*
	  	=	
	  	+=	[C += A] 
      	-=	
      	*=	
      	/=	 
      	%=	
	 
	 */
	int val=10;
	int val2;					
	public void show() {
		System.out.println("val2 : "+ val2);
		System.out.println(val2+=val);
		System.out.println("val2 : "+ val2);
	}
}

class TernaryOperator{
	
	
	/* find the max number   */
	public void show( int num1,int num2) {
		int max=(num1>num2)?num1:num2;
		
		/*
		if(num1>num2) {
			max=num1;
		}else {
			max=num2;
		}
		*/
		
		System.out.println("Maximum Value : "+max);
		
	}
	
}


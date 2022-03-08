package com.java.basic;

import java.util.Iterator;

public class I_JumpStatement {
		public static void main(String[] args) {
			
			
			for (int i = 1; i <=10; i++) {
				
				if(i<5) {
					continue;
				}
				System.out.print(i+" ");
				
			}
			
		}
}

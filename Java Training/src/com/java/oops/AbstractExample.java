package com.java.oops;

abstract class Secure {
	//non abstract method
	public void print() {
		System.out.println("I am non abstract");
	}
	
	abstract public void lock();
	
	abstract public void unLock();
}
abstract class SecureImpl extends Secure{


	abstract public void lock(); 

	@Override
	public void unLock() {
		System.out.println("system is unlocked");
		
	} 
	
}
class SecureImpl2 extends SecureImpl{

	@Override
	public void lock() {
		System.out.println("System is locked");
		
	}
	
}
public class AbstractExample {
	public static void main(String[] args) {
		//Secure secure = new Secure();
		
		//SecureImpl secureImpl=new SecureImpl();
		//secureImpl.print();
		//secureImpl.lock();
		//secureImpl.unLock();
		
		Secure secure=new SecureImpl2();
		secure.print();
		secure.lock();
		secure.unLock();
	}
}

package com.myapp;

public class Person3 {
	
	Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person3 [address=" + address + "]";
	}

	public Person3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void show() {
		System.out.println("Address : "+address.getAddress());
	}
	
}

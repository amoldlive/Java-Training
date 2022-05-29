package com.java.oops;

interface Upi {
	//constant variables
	//public static final String app_name="UPI";
	String app_name="UPI";
	
	//abstract methods
	String send(int amount, String upiId);

	//abstract public String receive(int amount, String upiId);
	String receive(int amount, String upiId);

}

class PhonePe implements Upi{

	@Override
	public String send(int amount, String upiId) {
		return "PhonePe : "+amount+" sent to "+upiId;
	}

	@Override
	public String receive(int amount, String upiId) {
		return "PhonePe : "+amount+" received from "+upiId;
	}
	
}
class GooglePay implements Upi{

	@Override
	public String send(int amount, String upiId) {
		// TODO Auto-generated method stub
		return "GooglePay >> : "+amount+" sent to "+upiId;
	}

	@Override
	public String receive(int amount, String upiId) {
		// TODO Auto-generated method stub
		return "GooglePay >> : "+amount+" received from "+upiId;
	}
	
	
}

public class InterfaceExample {
	public static void main(String[] args) {
		
		Upi phonePe=new PhonePe();
		String sendStatus=phonePe.send(1000, "abc@phonepe");
		System.out.println("Send Status : "+sendStatus);
		String receiveStatus=phonePe.receive(500, "cde@phonepe");
		System.out.println("Receive Status : "+receiveStatus);
	
		System.out.println("********************");
	
		Upi googlePay=new GooglePay();
		sendStatus=googlePay.send(1000, "abc@googlepay");
		System.out.println("Send Status : "+sendStatus);
		receiveStatus=googlePay.receive(500, "cde@googlepay");
		System.out.println("Receive Status : "+receiveStatus);
		
		
	}
}

package com.xworkz.methods;

public class InstanceMethod {
	//Instance method declaration
	 void evenNumber() {
		int number=124;
		if (number%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}
	
	public static void main(String args[]) {
		InstanceMethod instance=new InstanceMethod();
		instance.evenNumber();//calling instance methods by using object reference
	}
}


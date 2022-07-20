package com.xworkz.methods;

public class MethodTypes {

	//static method declaration
	static void evenNumber() {
		int number=124;
		if (number%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}
	
	public static void main(String args[]) {
		evenNumber();//method calling without class name
		MethodTypes.evenNumber(); //calling method with the reference of class name
	}
}

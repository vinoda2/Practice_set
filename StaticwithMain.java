package com.xworkz.practice;
/*static execution preference
 * static block
 * static methods
 * static variables
 * main method
*/
public class StaticwithMain {
	
	//static block declaration
	static {
		System.out.println("Static block ");
	}
	
	//static variable declaration and initialization
	static String S1="Static variable";
	
	//static method declaration
	public static void staticMethod() {
		System.out.println("Static methods");
	}
	
	//main method
	public static void main(String args[]){
		System.out.println(S1);//calling static variable
		StaticwithMain.staticMethod();//calling static method
		System.out.println("Main method");
	}

}

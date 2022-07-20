package com.xworkz.variables;

public class VariableTypes {
	static int a=10;// static variable
	int b=20;       //Non-static or instance variable
	
	public static void main(String args[]) {
		int c=40;  //local variable
		VariableTypes variable=new VariableTypes();
		
		System.out.println("Static variable:"+VariableTypes.a);
		System.out.println("Instance variable:"+variable.b);
		System.out.println("Local  variable:"+c);

	}
	
}

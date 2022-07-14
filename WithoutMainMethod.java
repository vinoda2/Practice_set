package com.xworkz.practice;

//we can write the code without main method in java compiler won't check while compiling But while running java Programming JVM checks whether
//main method is present or not bcz main method is the entry point for java
//this program will compile and won't give error but we can't run
public class WithoutMainMethod {

	static {
		System.out.println("Hello java main method");
		System.exit(0);
	}
}

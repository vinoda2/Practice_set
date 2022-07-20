package com.xworkz.oops;

public class Software {

	String name;
	int size;
	String ceo;
	double version;
	
	//constructor without parameter
	Software(){
		System.out.println("Constructor without parameter");
	}
	
	//Parameterized constructor
	public Software(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor with one parameter");
		this.name=name;
	}

	//Parameterized constructor
	public Software(String name, int size, String ceo, double version) {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor with parameter");
		this.name=name;
		this.size=size;
		this.ceo=ceo;
		this.version=version;
		
	}

	public void uploadPhoto() {
	
		System.out.println("Photo uploaded");
	}
	
	public void login() {
		System.out.println("Login success");
		}
}

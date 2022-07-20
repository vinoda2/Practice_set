package com.xworkz.oops;

public class Software_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//default constructor
		Software s1=new Software();
		s1.name="Facebook";
		s1.size=500;
		s1.ceo="jock ";
		s1.version=12.2;
		
		System.out.println(s1.name);
		System.out.println(s1.ceo);
		System.out.println(s1.size);
		System.out.println(s1.version);
		s1.login();
		s1.uploadPhoto();
		
		//parameterized constructor 
		Software insta = new Software(" Mark");
		System.out.println(insta.name);
		
		//parameterized constructor
		
		Software linkdin=new Software("Linkdin",620,"Marry",2.3);
		System.out.println(linkdin.name);
		System.out.println(linkdin.size);
		System.out.println(linkdin.ceo);
		System.out.println(linkdin.version);
		
	}

}

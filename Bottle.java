package com.xworkz.oops;

public class Bottle {

	int price;
	String color;
	String brand;
	
	public void open() {
		System.out.println("Bottle opened");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bottle B1=new Bottle();
		B1.price=123;
		B1.color="Blue";
		B1.brand="Millton";
		System.out.println(B1.price);
		System.out.println(B1.brand);
		System.out.println(B1.color);
		B1.open();

	}

}

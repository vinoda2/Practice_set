package com.xworkz.practice;

public class EvenOddNumber {

	//checking even or Odd number
	public static void numberCheck() {
		int n=124;
		if(n%2==0) {
			System.out.println("even number:"+n);
		}else {
			System.out.println("Odd number:"+n);
		}
	}
		
	//Take Array as a input and find the even and odd number in array
	public static void arrayNumber(int a1[]) {
		for(int i=0;i<=a1.length;i++) {
			if(i==0) {
				System.out.println("It is not a even number or Odd number");
			}
			if(i%2==0) {
				System.out.println("Even number:"+i);
			}else {
				System.out.println("Odd number:"+i);
			}
			
		}
	}
	public static void main(String[] args) {
		EvenOddNumber.numberCheck();
		int a1[]= {1,3,4,6,2,6,2,67,23,56,23,10};
		EvenOddNumber.arrayNumber(a1);
	}
}

package com.xworkz.practice;

public class WithOutLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Xworkz";
	      int i = 0;
	      char[] charArray = str.toCharArray();
		for (int j = 0; j < charArray.length; j++) {
			charArray[j]=charArray[j];
			i++;
		}
	      System.out.println("Length of the given string ::"+i);

	}

}

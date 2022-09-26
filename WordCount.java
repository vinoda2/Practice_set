package com.xworkz.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

//Write a Java Program to count the number of words in a string using HashMap.

public class WordCount {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCount word = new WordCount();
		String str="ye your beautifull you look fantastic, better, you";
		word.countWord(str);
		word.countWordHash(str);
		word.countWordArrayList(str);
		word.countWordLinkedList(str);
	}
	private void countWordLinkedList(String str) {
		LinkedList<Object> l=new LinkedList<Object>();

		String s2="hello";
		l.add(s2);
		System.out.println("word List is:"+l);
		System.out.println(l.size());//it will print the size of the LinkedList
		
		int count=0;
		String s[]=str.split(" ");
		for(int index=0;index<s.length;index++) {
			if(s[index].equals("you")) {
			System.out.println("duplicate element");
			count=count+1;
			}
			else {
				l.add(s[index]);
				count++;
			}
		}
		System.out.println(l);
		System.out.println("count is:"+count);
	}
	private void countWordArrayList(String str) {
		int count=0;
		ArrayList<String> array=new ArrayList<String>();
		String s[]=str.split(" ");
		for(int index=0;index<s.length;index++) {
			array.add(s[index]);
			count++;
		}
		System.err.println("Array list is:"+array);
		System.out.println("word count is:"+count);
		
	}
	//using HashMap
	private void countWordHash(String str) {
		int count=0;
		String s[]=str.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int index=0;index<s.length;index++) {
			map.put(s[index], count+1);
			count++;
		}
		System.out.println("words are:"+map);
		System.out.println("word count is:"+count);
		
		
	}
	//using normal method
	public void countWord(String str) {
		int count=0;
		String s[]=str.split(" ");
		for(int index=0;index<s.length;index++) {
			count++;
		}
		System.out.println("word count is:"+count);
		
	}

}

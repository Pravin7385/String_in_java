package com.string.in.java;

public class Example3 {

	public static void main(String[] args) {
		
		String s = "this is the String in your code";
	
		int count = 0;
		
		for(int i = 0 ; i < s.length() ; i++) {
			char ch = s.charAt(i);
			if(ch == ' ') {
				count++;
			}
		}
		System.out.println(" total space is :"+ count);
	}
}

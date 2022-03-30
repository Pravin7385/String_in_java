package com.string.in.java;

import java.util.Scanner;

public class Example1 {

	public static String getStudentName(String name) {
		return name;
	}
	
	public static void main(String[] args) {
		System.out.println("enter the name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		String s = getStudentName(name);
		System.out.println(s);
	}
}

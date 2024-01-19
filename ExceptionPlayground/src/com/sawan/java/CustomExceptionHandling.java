package com.sawan.java;

import java.util.Scanner;

public class CustomExceptionHandling {

	public static void main(String[] args) throws AgeException {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			System.out.println("Enter your age : ");
			
			int age = sc.nextInt();
			
			checkAge(age);
			
		} catch (Exception e) {
			
			System.out.println("Some problem occured : " + e);
		}
		finally {
			sc.close();
		}
		

	}
	
	
	static void checkAge(int age) throws AgeException,AgeBelowZeroException
	{
		if(age < 0) {
			throw new AgeBelowZeroException("Age cannot be negative!");
		}
		else if(age < 18 ) {
			throw new AgeException("You are below 18 years, so you cannot sign up!");
		}
		else {
			System.out.println("You are signed up!");
		}
		
	}
	

}

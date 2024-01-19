package com.sawan.java;

public class ExceptionHandlingLab {


	public static void main(String[] args) {
		
		
		try {
			int number = Integer.parseInt("1");
			System.out.println("This statement is inside try block after exception handling");
			System.out.println(number());
			
		}
		catch (NumberFormatException nfe) {
			System.out.println("Bro please provide number!");
		}
		finally {
			System.out.println("This is inside finally block");
		}
		
		 System.out.println("The end");
		 
		
	}
	public static int number() {
		
		try {
			System.out.println("This is try block of number() method");
			return 3;
			
		}
		catch (NumberFormatException nfe) {
			return 4;
			
		} 
		finally {
			return 5;
			
		}
		
	}

	
		
	

}

package com.sawan.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GeneralExceptionHandling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the number to  be divided : ");
			int num1 = sc.nextInt();
			
			System.out.println("Enter the divisor : ");
			int num2 = sc.nextInt();
			
			int z = num1 / num2;
			
			System.out.println("Result : "+ z);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Division cannot be done with 0. ");
			
		}
		catch (InputMismatchException ime) {
			
			System.out.println("Please enter a valid integer number!");
		}
		finally {
			sc.close();
		}
		
	}

}

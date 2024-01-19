package com.sawan.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingLab {

	public static void main(String[] args) {

		try {
			System.out.println("Please enter a number : ");
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			
			int number = Integer.parseInt(""+num);
			System.out.println("This statement is inside try block after exception handling");
			System.out.println(number());

		} catch (NumberFormatException nfe) {
			System.out.println("Bro please provide number!");
		} catch (InputMismatchException ime) {
			System.out.println("Please ");
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

		} catch (NumberFormatException nfe) {
			return 4;

		} finally {
			return 5;

		}

	}

}

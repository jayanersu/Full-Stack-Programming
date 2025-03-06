package com.phani.menu;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// Scanner(System.in)
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter Number2: ");
		int number2 = scanner.nextInt();
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();

		System.out.println("the number you enetered is " + number1);
		System.out.println("the number you enetered is " + number2);
		System.out.println("your choiced is " + choice);

		PerformOperationByUsingNestedIfElse(number1, number2, choice);
		PerformOperationByUsingSwitch(number1, number2, choice);

	}

	private static void PerformOperationByUsingNestedIfElse(int number1, int number2, int choice) {
		if (choice == 1) {
			System.out.println("your choice is addition so " + (number1 + number2));
		} else if (choice == 2) {
			System.out.println("your choice is Subtraction so " + (number1 - number2));
		} else if (choice == 3) {
			System.out.println("your choice is Division so " + (number1 / number2));
		} else if (choice == 4) {
			System.out.println("your choice is Multiplication so " + (number1 * number2));
		} else {
			System.out.println("Invalid operation");
		}
	}

	private static void PerformOperationByUsingSwitch(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("your choice is addition so " + (number1 + number2));
			break;
		case 2:
			System.out.println("your choice is Subtraction so " + (number1 - number2));
			break;
		case 3:
			System.out.println("your choice is Division so " + (number1 / number2));
			break;
		case 4:
			System.out.println("your choice is Multiplication so " + (number1 * number2));
			break;

		}
	}

	private static void puzzle1() {
		int number = 10;
		int i = number * 2;
		switch (number) {
		case 1:
			System.out.println("number is greater than 5");
			break;
		}
	}
}

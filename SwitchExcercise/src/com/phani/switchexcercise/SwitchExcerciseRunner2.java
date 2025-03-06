package com.phani.switchexcercise;

import java.util.Scanner;

public class SwitchExcerciseRunner2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.println(determineNameOfDay(5)); determineNameOfDay1(2);
		 * determineNameOfDay2(4);
		 */
//		System.out.println("Enter dayNumber is");
		int dayNumber = scanner.nextInt();
		determineNameOfDay(dayNumber);
		determineNameOfDay1(dayNumber);
		determineNameOfDay2(dayNumber);

	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thurday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		}
		return "Anwser is shown above";
	}

	public static void determineNameOfDay1(int dayNumber) {
		switch (dayNumber) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thurday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		}
	}

	public static String determineNameOfDay2(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";

		}
		return "Invalid";
	}
}

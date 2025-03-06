package com.phani.puzell;

public class IfstatementPuzzelRunner {

	public static void main(String[] args) {
//		puzell();
		puzell2();

	}

	public static void puzell() {
		int i = 25;
		if (i > 25) {
			System.out.println("i is greater than 25");
		} else if (i < 25 || i >= 20) {
			System.out.println(++i);
		} else if (i <= 20 || i >= 10) {
			System.out.println(i);
		} else {
			System.out.println("out of bound");
		}
	}

	public static void puzell2() {
		int k = 25;
		if (k > 25) {
			System.out.println("k is greater than 25");
		} else if (k < 25 || k >= 20) {
			System.out.println(++k);
		} else if (k <= 20 || k >= 10) {
			System.out.println(k);
		} else {
			System.out.println("out of bound");
		}
	}

}

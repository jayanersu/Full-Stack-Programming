package com.practice.test;

public class MultiplicationTable {
	void printMultiplicationTable() {
		printMultiplicationTableForAnyNumber(5);
	}

	void printMultiplicationTableForAnyNumber(int n) {
		printMultiplicationTableForAnyNumber(n, 11, 20);
	}

	void printMultiplicationTableForAnyNumber(int n, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.println(n * i);
		}
	}
}

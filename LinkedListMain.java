package com.bl.ll;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(
					"Enter 1 to add element \nEnter 2 to append element at start \nEnter 3 to insert element in between");
			switch (scanner.nextInt()) {
			case 1:
				Operations.addElementAtStart();
				break;
			case 2:
				Operations.appendElement();
				break;
			case 3:
				Operations.insertInBetween();
				break;
			}
		}
	}
}

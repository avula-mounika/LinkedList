package com.bl.ll;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		System.out.println("Welcome to linkedList DataStructure Program");
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter 1 to add the data ");
			System.out.println("Enter 2 to append the data at the start");
			switch (scanner.nextInt()) {
			case 1:
				Operations.addElementAtStart();
				break;
			case 2:
				Operations.appendElement();
				break;
			}
		}
	}
}

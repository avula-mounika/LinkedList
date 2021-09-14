package com.bl.ll;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(
					"Enter 1 to add element \nEnter 2 to append element at start \nEnter 3 to insert element in between"
					+ "\nEnter 4 to pop an first element\nEnter 5 to pop an last element\nEnter 6 to search element"
					+ "\nEnter 7 to add data after searching specific data");
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
			case 4:
				Operations.deleteFirstElement();
				break;
			case 5:
				Operations.deleteLastElement();
				break;
			case 6:
			    Operations.searchValue();
			    break;
			case 7:
                Operations.insertAfterSearch();
                break;
			}
		}
	}
}

package com.bl.ll;

public class Operations {
	public static LinkedLists addElementAtStart() {
		LinkedLists linkedList = new LinkedLists();
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);
		linkedList.print();
		return linkedList;
	}

	public static void appendElement() {
		LinkedLists linkedList = new LinkedLists();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.print();
	}

	public static void insertInBetween() {
		LinkedLists linkedList = new LinkedLists();
		linkedList.insert(56);
		linkedList.insert(70);
		linkedList.insert(30);
		linkedList.print();
	}

	public static void deleteFirstElement() {
		LinkedLists linkedlist = new LinkedLists();
		linkedlist.push(70);
		linkedlist.push(30);
		linkedlist.push(56);
		linkedlist.popFirst();
		linkedlist.print();

	}

	public static void deleteLastElement() {
		LinkedLists linkedlist = new LinkedLists();
		linkedlist.push(70);
		linkedlist.push(30);
		linkedlist.push(56);
		linkedlist.popLast();
		linkedlist.print();
	}

	public static void searchValue() {
		LinkedLists linkedList = addElementAtStart();
		linkedList.searchNode(30);
	}

	public static LinkedLists insertAfterSearch() {
		System.out.println("Before Insertion");
		LinkedLists linkedList = addElementAtStart();
		Node newNode = new Node(40);
		Node previousNode = linkedList.insertAfter(30, newNode);
		System.out.println("After Insertion");
		linkedList.print();
		return linkedList;
	}

	public static void deleteSpecificElement() {
		System.out.println("Before deletion:");
		LinkedLists linkedList = insertAfterSearch();
		System.out.println("After");
		linkedList.deleteNode(40);
		System.out.println("After deletion:");
		linkedList.print();
		int size = linkedList.size();
		System.out.println("Linked size is " + size);

	}

}

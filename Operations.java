package com.bl.ll;

public class Operations {
	public static void addElementAtStart() {
		LinkedLists linkedList = new LinkedLists();
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);
		linkedList.print();
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

	public static void popElement() {
		LinkedLists linkedlist =new LinkedLists();
        linkedlist.push(70);
        linkedlist.push(30);
        linkedlist.push(56);
        linkedlist.popFirst();
        linkedlist.print();
		
	}
	
	
}

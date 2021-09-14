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
}

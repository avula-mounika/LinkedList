package com.bl.ll;

public class LinkedLists {

	Node head;
	Node tail;

	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
	}

	public void append(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			this.head = newnode;
			this.tail = newnode;
		} else {
			Node temp = tail;
			this.tail = newnode;
			temp.next = tail;
		}
	}

	public void insert(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			this.head = newnode;
		} else if (tail == null) {
			this.tail = newnode;
		} else {
			Node temp = newnode;
			temp.next = this.tail;
			this.head.next = temp;
		}
	}

	public void popFirst() {
		if (head == null) {
			System.out.println("\nList is empty!!!");
		} else {
			Node temp = this.head.next;
			head = temp;
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("Linked List is Empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

}

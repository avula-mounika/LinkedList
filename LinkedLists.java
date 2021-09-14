package com.bl.ll;

public class LinkedLists {

	Node head;
	Node tail;
//to add elements
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
//method to append elements
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
//to insert elements
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
//to delete first element using pop
	public void popFirst() {
		if (head == null) {
			System.out.println("\nList is empty!!!");
		} else {
			Node temp = this.head.next;
			head = temp;
		}
	}
//to delete last element using pop
	public void popLast() {
		if (head == null) {
			System.out.println("\nList is empty!!!");
		} else {
			Node temp = this.head.next;
			head = temp;
		}
	}
//to search an element
	public void searchNode(int value) {
		Node tempNode = head;
		int index = 1;
		boolean flag = false;
		if (head == null)
			System.out.println("List is empty");
		else {
			while (tempNode != null) {
				if (tempNode.data == value) {
					flag = true;
					break;
				}
				index++;
				tempNode = tempNode.next;
			}
		}
		if (flag == true) {
			System.out.println(value + " is present at " + index);
		} else {
			System.out.println("Element is not present");
		}

	}
//to insert an element 40 after 30 element in the linked list 
	public Node insertAfter(int value, Node newNode) {
		Node tempNode = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (tempNode != null) {
				if (tempNode.data == value) {
					break;
				}
				tempNode = tempNode.next;

			}
			Node tempNodeNext = tempNode.next;
			tempNode.next = newNode;
			newNode.next = tempNodeNext;
		}
		return tempNode;
	}
//to delete element 40
	public void delete(int value) {
		if (this.head == null) {
			System.out.println("Linked List is empty ");
			return;
		}
		Node tempNode = head;
		while (tempNode.next.data != value) {
			tempNode = tempNode.next;
		}
		Node prevNode = tempNode;
		Node nextNode = prevNode.next.next;
		prevNode.next = nextNode;
	}
//to find size of the list
	public int size() {
		if (this.head == null) {
			System.out.println("Linked List is empty ");
			return 0;
		}
		Node tempNode = head;
		int size = 1;
		while (tempNode.next != null) {
			size++;
			tempNode = tempNode.next;
		}
		return size;
	}
//to sort the list
	public void sort() {
		Node i = head, j = null;
		if (head == null) {
			System.out.println("Linked list is empty");
			return;
		}
		while (i != null) {
			j = i.next;
			while (j != null) {
				if (i.data > j.data) {
					int temp = i.data;
					i.data = j.data;
					j.data = temp;
				}
				j = j.next;
			}
			i = i.next;
		}
	}
//to print 
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

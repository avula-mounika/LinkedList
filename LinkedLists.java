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

	public void popLast() {
		if (head == null) {
			System.out.println("\nList is empty!!!");
		} else {
			Node temp = this.head.next;
			head = temp;
		}
	}

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

	public void deleteNode(int value) {
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

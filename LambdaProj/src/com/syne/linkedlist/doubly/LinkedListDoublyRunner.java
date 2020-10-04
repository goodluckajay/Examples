package com.syne.linkedlist.doubly;

public class LinkedListDoublyRunner
{
	public static void main(String[] args) 
	{
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);
		dll.add(50);
		dll.print();
		
	}
}

class DoublyLinkedList
{
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int value)
		{
			this.data = value;
			this.next = null;
			this.prev = null;
		}
	}
	
	void add(int value)
	{
		Node node = new Node(value);
		if (head == null)
		{
			head = node;
			node.next = null;
			return;
		}
		Node temp = head;
		while (temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = node;
		node.prev = temp;
		return;
	}
	
	void print()
	{
		Node printer = head;
		Node last = null;
		
		while(printer != null)
		{
			System.out.print(printer.data + " ");
			last = printer;
			printer = printer.next;
		}
		System.out.println("");
		while(last != null)
		{
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}
}
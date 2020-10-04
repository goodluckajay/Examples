package com.syne.linkedlist.loop;

public class LinkedListLoopRunner 
{
	public static void main(String[] args) 
	{
		LinkedListLoop loop = new LinkedListLoop();
		loop.add(1);
		loop.add(2);
		loop.add(3);
		loop.add(4);
		loop.add(5);
		loop.print();
		System.out.println("");
		
		loop.head.next.next.next.next.next = loop.head;
		loop.detectLoop();
	}
}

class LinkedListLoop
{
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int value)
		{
			this.data = value;
			this.next = null;
		}
	}
	
	void add(int value)
	{
		Node node = new Node(value);
		if (head == null)
		{
			head = node;
			return;
		}
		Node temp = head;
		while (temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = node;
		return;				
	}
	
	void print()
	{
		Node printer = head;
		while (printer != null)
		{
			System.out.print(printer.data + " ");
			printer = printer.next;
		}
	}
	
	void detectLoop()
	{
		Node slow = head;
		Node fast = head;
		while (fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
			{
				System.out.println("Loop Detected...at node : " + fast.data);
				return;
				
			}
		}
	}
}

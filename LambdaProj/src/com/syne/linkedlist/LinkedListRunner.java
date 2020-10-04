package com.syne.linkedlist;

public class LinkedListRunner
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		
		System.out.println(ll.add(10));
		System.out.println(ll.add(20));
		System.out.println(ll.add(30));
		System.out.println(ll.add(40));
		System.out.println(ll.add(50));
		
		ll.print();
		System.out.println();
		System.out.println("Size : " + ll.size());
		System.out.println("Node at index : " + ll.getNodeAtIndex(2));
		System.out.println("Deleted Node : " + ll.deleteNodeAtIndex(0));
		ll.print();
		System.out.println();
		System.out.println("Size : " + ll.size());
		System.out.println("Node at index : " + ll.getNodeAtIndex(2));
		
	}
}

class LinkedList
{
	Node head;
	Node newHead;
	
	class Node
	{
		Node next;
		int data;
		Node(int value)
		{
			this.data = value;
			this.next = null;
		}
	}
	
	boolean add(int value)
	{
		boolean flag = false;
		Node node = new Node(value);
		if (head == null)
		{
			head = node;
			flag = true;
			return flag;
		}
		Node temp = head;
		while (temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = node;
		flag = true;
		return flag;		
	}
	
	void print()
	{
		Node printer = null;
		if (head != null)
		{
			printer = head;
			while (printer != null)
			{
				System.out.print(printer.data + " ");
				printer = printer.next;
			}
		}
		else
		{
			printer = newHead;
			while (printer != null)
			{
				System.out.print(printer.data + " ");
				printer = printer.next;
			}
		}
	}
	
	int size()
	{
		int size = 0;
		Node cursor = null;
		if (head != null)
		{
			cursor = head;
			while (cursor != null)
			{
				cursor = cursor.next;
				size++;
			}
		}
		else
		{
			cursor = newHead;
			while (cursor != null)
			{
				cursor = cursor.next;
				size++;
			}
		}
		return size;
	}
	
	int getNodeAtIndex(int index)
	{
		int counter = 0;
		int nodeValue = -1;
		Node cursor = null;
		if (head != null)
		{
			if (index == 0)
			{
				nodeValue = head.data;
				return nodeValue;
			}
			else
			{
				cursor = head;
				while (cursor.next != null)
				{
					cursor = cursor.next;
					counter++;
					if (counter == index)
					{
						nodeValue = cursor.data;
					}
				}
			}
		}
		else
		{
			if (index == 0)
			{
				nodeValue = newHead.data;
				return nodeValue;
			}
			else
			{
				cursor = newHead;
				while (cursor.next != null)
				{
					cursor = cursor.next;
					counter++;
					if (counter == index)
					{
						nodeValue = cursor.data;
					}
				}
			}
		}
		return nodeValue;
	}
	
	int deleteNodeAtIndex(int index)
	{
		int nodeValue = -1;
		int counter = 0;
		Node prev = null;
		Node curr = null;
		if (head != null)
		{
			if (index == 0)
			{
				nodeValue = head.data;
				newHead = head.next;
				head = null;
				return nodeValue;
			}
			curr = head;
			while (curr.next != null)
			{
				prev = curr;
				curr = curr.next;
				counter++;
				if (counter == index)
				{
					nodeValue = curr.data;
				}
			}
		}
		else
		{
			
		}
		return nodeValue;
	}
}
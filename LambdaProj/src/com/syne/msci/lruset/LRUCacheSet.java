package com.syne.msci.lruset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LRUCacheSet 
{
	Set<Integer> set;
	int capacity;

	LRUCacheSet(int width)
	{
		set = new LinkedHashSet<Integer>(width);
		this.capacity = width;
	}

	private void addOperation(int value)
	{
		Iterator<Integer> it = null;
		if (set.contains(value))
		{
			it = set.iterator();
			set.remove(it.next());
		}			

		else if (set.size() == capacity)
		{
			it = set.iterator();
			set.remove(it.next());

		}
		set.add(value);						
	}

	private void removeOperation(int value)
	{
		if (set.contains(value))
		{
			set.remove(value);
		}
	}

	private void printAll()
	{
		Iterator it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println("-----");
		return;
	}
	public static void main(String[] args)
	{
		LRUCacheSet cache = new LRUCacheSet(5);

		cache.addOperation(10);
		cache.addOperation(20);
		cache.addOperation(30);
		cache.printAll();

		cache.removeOperation(30);
		cache.printAll();


		cache.addOperation(10);
		cache.printAll();

		cache.addOperation(50);
		cache.addOperation(60);			
		cache.addOperation(70);
		cache.printAll();

		cache.addOperation(80);

		cache.printAll();
	}
}

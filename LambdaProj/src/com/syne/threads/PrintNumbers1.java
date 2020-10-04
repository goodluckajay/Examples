package com.syne.threads;

public class PrintNumbers1 
{
	final static int MAX_NUMBERS = 10;
	public static void main(String[] args)
	{
		// shared object
		PrintNumbers obj = new PrintNumbers();
		// Creating 3 threads
		Thread t1 = new Thread(new NumberRunnable1(obj, 0), "T1");
		Thread t2 = new Thread(new NumberRunnable1(obj, 1), "T2");
		Thread t3 = new Thread(new NumberRunnable1(obj, 2), "T3");
		t1.start();
		t2.start();
		t3.start();
	}
}

class NumberRunnable1 implements Runnable
{
	PrintNumbers obj;
	int threadNumber;
	static volatile int number = 0;
	NumberRunnable1(PrintNumbers obj, int result)
	{
		this.obj = obj;
		this.threadNumber = result;
	}
	@Override
	public void run() 
	{   
		synchronized(obj) 
		{	
			while (number < PrintNumbers.MAX_NUMBERS - 2) 
			{
				while(number % 3 != threadNumber){
					try
					{
						obj.wait();
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " - " + ++number);
				obj.notifyAll();
			}
		}                            
	}
}
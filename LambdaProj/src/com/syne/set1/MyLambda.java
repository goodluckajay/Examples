package com.syne.set1;

public class MyLambda implements MyInterface
{
	public static void main(String args[])
	{
		
	}

	@Override
	public void test() {
			
	}
	
	MyInterface data = () -> System.out.println("sdf");
	
}

// Note: MyLambda implements MyInterface and already given Lambda expression of interface method at line 15 but still class
// has to give the defination of interface method at line no. 11 other wise its compile time error

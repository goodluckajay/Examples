package com.syne.set3;

public class MyMainClass {
	
	public static void main(String args[])
	{
		//
	}
	
	MyInteface i = () -> System.out.println();

}


// Note: We can't give create Lambda expression of static method because first thing is left hand side must be Funtional Interface
//  and if we give static method in interface then it must have body and if we dont give body of method inside interface then
// it can't be static.
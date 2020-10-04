package com.syne.msci;

import java.util.HashMap;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {
		Map<Student, Integer> studentMap = new HashMap<Student, Integer>();
		for (int i = 0 ; i < 10;  i++ )
		{
			studentMap.put(new Student(), i);
		}
		System.out.println("Size of Map : " + studentMap.size());
		System.out.println("==========================================");
		
		Map<Student, Integer> studentNewMap = new HashMap<Student, Integer>();
		Student student = new Student();
		for (int i = 0 ; i < 10;  i++ )
		{
			studentNewMap.put(student, i);
		}
		
		System.out.println("Size of studentNewMap Map : " + studentNewMap.size());
		
	}
}

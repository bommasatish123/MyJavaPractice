package com.bomma;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemoList {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		
		values.add(5);
		values.add(6);
		values.add(9);
		values.add(2);
		
		for(Integer i: values) 
		{
			System.out.println(i);
			
		}
		
	/*	for(int i=0;i<values.size(); i++)
		{
			System.out.println(values.get(i));
			
		} */
		
	}

}

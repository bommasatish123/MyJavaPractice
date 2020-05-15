package com.bomma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListComparatorDemo {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		
		values.add(404);
		values.add(967);
		values.add(213);
		values.add(678);
		
		Comparator<Integer> c = new Comparator<Integer>()
				{
					public int compare(Integer i, Integer j) 
					{
						return i%10>j%10? 1: -1;
					}
				};
		//Comparator<Integer> c1 = (i,j) -> i%10>j%10?1:-1;
		// Collections.sort(values, c1);
				
		//Collections.sort(values, c);
				
		Collections.sort(values, (i,j) -> i%10>j%10?1:-1);
		
		for(Integer o : values) 
		{
			System.out.println(o);
		}
	}

}

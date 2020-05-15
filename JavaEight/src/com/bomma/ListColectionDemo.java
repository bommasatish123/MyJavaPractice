package com.bomma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListColectionDemo {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		
		values.add(4);
		values.add(5);
		values.add(8);
		values.add(9);
		values.add(2);
		
		Collections.sort(values);
		Collections.reverse(values);
		
		for(Integer i : values)
		{
			System.out.println(i);
		}

	}

}

package com.bomma;

import java.util.Set;
import java.util.TreeSet;

public class SetTreeDemo {

	public static void main(String[] args) {

		Set<Integer> values = new TreeSet<>();
		
		values.add(87);
		values.add(97);
		values.add(34);
		values.add(92);
		
		for(int i : values)
		{
			System.out.println(i);
		}
		

	}

}

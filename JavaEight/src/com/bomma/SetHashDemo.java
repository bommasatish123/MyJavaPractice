package com.bomma;

import java.util.HashSet;
import java.util.Set;

public class SetHashDemo {

	public static void main(String[] args) {
		
		Set<Integer> values = new HashSet<>();
		
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

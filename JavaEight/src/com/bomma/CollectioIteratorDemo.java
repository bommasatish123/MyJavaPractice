package com.bomma;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectioIteratorDemo {

	public static void main(String[] args) {
		
		//Collection values = new ArrayList (); // 1.2
		Collection<Integer> values = new ArrayList<>(); // 1.5 java version
		
		
		values.add(4);
		values.add(6);
		values.add(9);
		
		Iterator<Integer> it = values.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}

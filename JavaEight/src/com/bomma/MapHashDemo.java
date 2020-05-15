package com.bomma;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapHashDemo {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("myName", "Satish");
		map.put("actor", "Mahesh");
		map.put("ceo", "Satyam");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys)
		{
			System.out.println(key + " " + map.get(key));
		}
		

	}

}

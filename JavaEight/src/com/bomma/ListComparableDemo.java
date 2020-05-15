package com.bomma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{

	int rollno, marks;
	String name;
	public Stud(int rollno, String name, int marks) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Stud s) {
		
		return marks > s.marks?1:-1;
	}
	
}

public class ListComparableDemo {

	public static void main(String[] args) {
		
		List<Stud> s1 = new ArrayList<>();
		
		s1.add(new Stud(21,"Satish", 91));
		s1.add(new Stud(24,"Jai", 82));
		s1.add(new Stud(27,"Divya", 67));
		
		Collections.sort(s1);
		
		for(Stud s : s1)
		{
			System.out.println(s);
		}
		

	}

}

package com;

import java.util.ArrayList;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {
		
		List<Person> personList= new ArrayList();
		List<Person> personList2= new ArrayList();
		Person p1 = new Person("A",12);
		Person p2 = new Person("B",13);
		Person p3 = new Person("C",14);
		Person p4 = new Person("D",15);
		Person p5 = new Person("A",16);
		personList.add(p1);personList.add(p2);personList.add(p3);personList.add(p4);personList.add(p5);
		
		personList2=personList;
		
		personList.stream().filter(p -> p.getName()==personList2.get(i))
						.forEach(p -> System.out.print(p));
	}
}

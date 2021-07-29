package com.samples.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MyCollections {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		addData(list);
		
		System.out.println("Sorted List:");
		System.out.println("----------------");
		sortData(list);
		
		System.out.println();
		
		Set<String> set = new HashSet<String>();
		addData(set);
		
		System.out.println("Sorted Set:");
		System.out.println("----------------");
		sortData(set);
	}

	private static void sortData(Collection<String> collection) {
		Collection<Object> sortedList2 = collection.stream().sorted().collect(Collectors.toList());
		sortedList2.forEach(obj -> System.out.println(obj));
	}

	private static void addData(Collection<String> collection) {
		collection.add("Amzad");
		collection.add("Arshad");
		collection.add("Afsar");
		collection.add("Basha");
		collection.add("Nikhath");
	}


}

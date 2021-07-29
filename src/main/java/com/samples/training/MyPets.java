package com.samples.training;

public class MyPets {

	public static void main(String[] args) {
		Browny pet1 = new Browny("Browny", "Bulldog");
		Snoopy pet2 = new Snoopy("Snoopy", "Dalmatian");
		
		System.out.println("Pet1: " + pet1);
		System.out.println(" Uniqueness: " + pet1.uniqueness());
		System.out.println("Pet2: " + pet2);
		System.out.println(" Uniqueness: " + pet2.uniqueness());
	}

}

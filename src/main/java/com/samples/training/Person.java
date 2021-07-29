package com.samples.training;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String name;
	private LocalDate dob;
	private String citizenship;

	private static LocalDate start70s = LocalDate.of(1970, 1, 1);
	private static LocalDate end70s = LocalDate.of(1979, 12, 31);
	private static LocalDate start80s = LocalDate.of(1980, 1, 1);
	private static LocalDate end80s = LocalDate.of(1989, 12, 31);
	private static LocalDate start90s = LocalDate.of(1990, 1, 1);
	private static LocalDate end90s = LocalDate.of(1999, 12, 31);

	public Person(String name, LocalDate dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public static void main(String[] args) {
		Person person1 = new Person("Amzad", LocalDate.of(1976, 11, 23));
		person1.setCitizenship("Indian");
		System.out.println(person1.getName());
		System.out.println(person1.getDob());
		System.out.println(person1.getCitizenship());
		System.out.println(calculateAge(person1.dob));
		generationCheck(person1);
		isPresidentialCandidate(person1);
		System.out.println();

		Person person2 = new Person("Arshad", LocalDate.of(2005, 6, 28));
		person2.setCitizenship("American");
		System.out.println(person2.getName());
		System.out.println(person2.getDob());
		System.out.println(person2.getCitizenship());
		System.out.println(calculateAge(person2.dob));
		generationCheck(person2);
		isPresidentialCandidate(person2);
		System.out.println();

		Person person3 = new Person("Afsar", LocalDate.of(2008, 8, 16));
		person3.setCitizenship("South Korean");
		System.out.println(person3.getName());
		System.out.println(person3.getDob());
		System.out.println(person3.getCitizenship());
		System.out.println(calculateAge(person3.dob));
		generationCheck(person3);
		isPresidentialCandidate(person3);
	}

	private static void isPresidentialCandidate(Person person) {
		if (person.getCitizenship().equals("American")) {
			System.out.println("Eligible for Presidential Election");
		}
		
		if (person.getCitizenship().equals("American") && calculateAge(person.dob) >= 30) {
			System.out.println("Eligible for Presidential Election");
		}
	}

	private static int calculateAge(LocalDate birthDate) {
		return Period.between(birthDate , LocalDate.now()).getYears();
	}

	private static void generationCheck(Person person) {
		if (generation(person, start70s, end70s)) {
			System.out.println("Old School Kid");
		} else if (generation(person, start80s, end80s)) {
			System.out.println("Convent School Kid");
		} else if (generation(person, start90s, end90s)) {
			System.out.println("Techno School Kid");
		} else if (person.dob.isAfter(end90s)) {
			System.out.println("Cyber Generation Kid");
		}
	}

	private static boolean generation(Person person, LocalDate start, LocalDate end) {
		return person.dob.isAfter(start) && person.dob.isBefore(end);
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

}

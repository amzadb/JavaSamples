package com.samples.training;

import java.time.LocalDate;

public class Employee {

	private int id;
	private String name;
	private int dailyHours = 8;
	private String type;
	private LocalDate endDate;

	private Salary salaryInfo = new Salary();

	public Employee(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}

	static Employee create(int id, String name, String type) {

		Employee emp = new Employee(id, name, type);

		if (type.equals("FullTime")) {
			emp.dailyHours = 8;
		} else if (type.equals("PartTime")) {
			emp.dailyHours = 3;
			emp.endDate = LocalDate.of(2021, 5, 31);
		} else if (type.equals("Contractor")) {
			emp.dailyHours = 10;
			emp.endDate = LocalDate.of(2021, 12, 31);
		}

		return emp;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dailyHours=" + dailyHours + ", type=" + type + ", endDate="
				+ endDate + "]";
	}

	public static void main(String[] args) {
		Employee emp1 = Employee.create(1, "Amzad", "Contractor");
		Employee emp2 = Employee.create(2, "Arshad", "PartTime");
		Employee emp3 = Employee.create(3, "Afsar", "FullTime");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}

//	public Salary getSalaryInfo() {
//		return salaryInfo;
//	}

}

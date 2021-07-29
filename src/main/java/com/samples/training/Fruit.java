package com.samples.training;

public abstract class Fruit {
	private String name;
	private String taste;

	
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name) {
		this.setName(name);
	}

	public abstract String getTaste();

//	public String getTaste() {
//		switch (this.name) {
//		case "APPLE":
//			taste = "Sweet";
//			break;
//		case "ORANGE":
//			taste = "Sweet tart";
//			break;
//		case "GRAPE":
//			taste = "Sour";
//			break;
//		default:
//			taste = "Salty";
//		}
//		return taste;
//	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Fruit fruit1 = new Apple();
		System.out.println(fruit1.getName());
		System.out.println(fruit1.getTaste());
		
		Fruit fruit2 = new Orange();
		System.out.println(fruit2.getName());
		System.out.println(fruit2.getTaste());
	}
}

class Apple extends Fruit {
	public Apple() {
		setName("APPLE");
	}

	public Apple(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTaste() {
		return "Sweet";
	}

}

class Orange extends Fruit {

	public Orange() {
		setName("ORANGE");
	}

	public Orange(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTaste() {
		return "Sweet tart";
	}

}

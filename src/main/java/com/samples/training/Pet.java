package com.samples.training;

public class Pet {

	protected String name;
	protected String breed;

	public Pet() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", breed=" + breed + "]";
	}
}
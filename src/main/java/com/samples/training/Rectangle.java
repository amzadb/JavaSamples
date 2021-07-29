package com.samples.training;

public class Rectangle {
	private int length;
	private int width;
	private int area;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getArea() {
		return length * width;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", area=" + getArea() + "]";
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setWidth(12);
		System.out.println(r);
	}

}

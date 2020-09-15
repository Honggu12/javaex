package com.javaex.oop.point.v2;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		p1.setX(10);
		p1.setY(20);
		p1.draw();
		
		Point p2 = new Point(30, 40);
		p2.setX(30);
		p2.setY(40);
		p2.draw();
	}

}

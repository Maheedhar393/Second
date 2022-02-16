package com.capg.shapes;

public class Circle {

	private float radius;
	float pi;
	public Circle(){
		radius=1.5f;
	}
	Circle(float radius){
		this(radius,3.5f);
	}
	Circle(float radius,float pi){
		this.radius=radius;
		this.pi=pi;
	}
	public float getRadius() {
		return radius;
	}
}

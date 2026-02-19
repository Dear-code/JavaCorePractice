package com.suhani.basics;

public class Polymorphism {
	// one objet behaves in may ways in differenr situation
	//two types-
	//1. method overloading - same name different parameters
	
	public int add( int a, int b) {
		return a+b;
		}
	
	public float add( float a, float b,float c) {
		return a+b+c;
		}
	public double add( double a, double b) {
		return a+b;
		}
	
	//2.method overroding 
	
	static class car1{
		public void name() {
			System.out.println("suv");
		}
	}
	
	static class car2 extends car1{
		@Override
		public void name() {  // same name same parameters
			System.out.println("kea");
		}
		
		public void display() {
			super.name();
		}
	}
	
	public static void main(String[] args) {
		Polymorphism p1= new Polymorphism();
		System.out.println(p1.add(200, 300));
		System.out.println(p1.add(20, 10));
		System.out.println(p1.add(20.1f, 30.23f, 22.22f));
		
		car1 c= new car2();// upcasting
		c.name();
		
		car2 c2 = (car2) c;		// downcasting
		c2.display();
		
		
	
		
		
	}
	

}

package com.suhani.basics;

public class Basics {
	//type casting - means conversion of one datatype to another 
	// 1. implicit type casting- direct conversion (Automatic)
	
	public static void impli() {
		int a=10;
		float d= a;
		
		System.out.println(d);
	}
	
	// 2. explicit type casting - conversion of large datatype into small (manually done )
	//          may chances of data loss
	
	public static void expli() {
		float c= 20.25f;
		int e= (int)c;
			 
		System.out.println(e);
			 
		 }
	
	// changing type of objects
	// 1. upcasting - chind object to parent reference
	//	  works in inheritance
	
	static class Animal{
		public void sound() {
			System.out.println("Animal");
		}
	}
	
	static class Dog extends Animal{
		public void sound() {
			System.out.println("dog sound");
		}
		
		public void bark() {
			System.out.println("dog");
		}
	}
		 

	public static void main(String[] args) {
		//impli(); // implicit casting
		//expli(); // explicit casting
		
		Animal obj= new Dog(); //upcasting - child onject but parent type reference
		obj.sound();// we only access parent methods cause type of reference is parent 
		//Upcasting is used for achieving runtime polymorphism and generalization.
		
		// now lets do downcasting
		// Downcasting is used when we need to access child-specific behavior from a parent reference.
		 Dog d= (Dog) obj;
		 d.bark();
		
		
		
	}
	
	                   

}

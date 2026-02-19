package com.suhani.basics;

public class Inheritance {
	//child class aquires all the properties of parent class
	//types of inheritance- single,multilevel,hirararchical
	// multiple inheritance not supporte in java cause it creates aamiguity 

	static class Animal{ //parent class
		public void sound() {
			System.out.println("animals sound");
		}
	}
	
	static class Dog extends Animal { //child class
		public void bark() {
			System.out.println("dog barking");
		}
	}
	
	public static void main(String[] args) {
		Dog d1= new Dog();
		d1.bark();
		d1.sound();
		
	}

}


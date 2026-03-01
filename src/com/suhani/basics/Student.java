package com.suhani.basics;

public interface Student {
	int a=20; //atributes are by default final and static
	public void name(); // methods in interface are by default abstract and public 

	default void rollno() {
		System.out.println("default method");
	}
	
}

class Stu1 implements Student{ // must implements all abtract methods
	
	public void name(){
		System.out.println("implemented");
	}
	
}

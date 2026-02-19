package com.suhani.basics;

import java.util.Scanner;

// encapsulated class
public class Oops {
	
	// 1. Encapsulation- means wrapping the data(variables) and methods in a single unit i.e class 
	//    to restrict the direct access to data
	//    provides data security, integrity
	//    we declared variables as private and access them using getter and setter methods
	
	private String name;
	private int rollNo;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo= rollNo;
	}
	
	public String getname() {
		return name;
		
	}
	public int getRollNo() {
		return rollNo;
		
	}
	
	

}

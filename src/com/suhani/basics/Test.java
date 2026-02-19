package com.suhani.basics;

import java.util.Scanner;

public class Test extends Abstatction {
	
	public void display() {
		System.out.println("abstarct method excuted");
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Oops o= new Oops();
		
		System.out.println("enter name:");
		String name= sc.next();
		System.out.println("enter roll no:");
		int RollNo= sc.nextInt();
		
		o.setName(name); // setting private variables
		o.setRollNo(RollNo);
		
		System.out.println("student details:");
		System.out.println("name:" +o.getname());
		System.out.println("roll no: "+o.getRollNo());
		
		Test t1= new Test();
		t1.display();
		
		
		}

}

package com.suhani.basics;

public class Exception {
	
	public static void main(String[] args) {
		
		try {
			
			int a=20;
			int result= a/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("handled");
		}
		finally{
			System.out.println("program continues");
			
		}
	}

}

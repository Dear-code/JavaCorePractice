package com.suhani.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AList {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		List<Employee> data= new ArrayList<Employee>();
		boolean res=true;
		while(res) {
			
		Employee e= new Employee();
		System.out.println("enter id");
		e.setId(sc.nextInt());
		System.out.println("enter name:");
		e.setName(sc.next());
		
		data.add(e);
		System.out.println("enter 0 for exit:");
		int i= sc.nextInt();
		if(i==0) {
			res=false;
		}
		}
		
		Iterator<Employee> itr=  data.iterator();	
		
		while(itr.hasNext()) {
			Employee s= itr.next();
			System.out.println("id is:"+s.getId());
			System.out.println("name is:"+s.getName());
		}
	

}
}

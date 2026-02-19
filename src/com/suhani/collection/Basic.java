package com.suhani.collection;

import java.util.ArrayList;
import java.util.List;

public class Basic {
	
	public static void main(String[] args) {
		// non generic collection -store different types of data
		
		List list= new ArrayList();
		list.add(1);
		list.add("suhani");
		list.add(20.2f);
		
		System.out.println(list);
		
		//generic collection -store same type of data
		
		List<String> same= new ArrayList<String>();
		same.add("suhani");
		same.add("purva");
		same.add("aarya");
		
		System.out.println(same);
		
       
		
	}
	

}

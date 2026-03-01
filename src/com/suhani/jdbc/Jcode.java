package com.suhani.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jcode {
	public static void main(String[] args) {
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3308/java","root","Suha@123");
           System.out.println("connection established");
           Statement stm= conn.createStatement();
           
           String query = "Insert into student values(1,'suhani')";
           int i= stm.executeUpdate(query);
           System.out.println(i+ "data inserted");
           
           conn.close();
           

        } catch (Exception e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
	}

}

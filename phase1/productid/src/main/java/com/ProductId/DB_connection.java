package com.ProductId;
import java.sql.Connection;
	import java.sql.DriverManager;

	public class DB_connection {
		  static Connection con = null;
		    public static Connection getConnection() {
		        try {
		             Class.forName("com.mysql.cj.jdbc.phase");
		            String url = "jdbc:mysql://localhost:3306/subha";
		            String user = "root";
		            String password = "subha&02";
		            con = DriverManager.getConnection(url, user, password);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        return con;
		    }

	}



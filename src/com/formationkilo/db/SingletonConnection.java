package com.formationkilo.db;

public class SingletonConnection {
   private static Connection conn;
   static {
	   conn=new Connection();
   }
   public static Connection getConnection() {
	   return conn;
   }
   
}

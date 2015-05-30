package p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db_p {

public Db_p(){}
	
	Connection conn = null;
	   Statement stmt = null;
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/abc";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";  
	   
	   public  Connection Connect() throws ClassNotFoundException {
	   
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	     
	      //STEP 6: Clean-up environment
	     
	     
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }
	   return conn;
	   }//e
	
}

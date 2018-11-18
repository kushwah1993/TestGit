package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	
	  static void selectQuery() throws SQLException {
		  Connection conn = null; 
		  String url = "jdbc:sqlite:E:\\workspace\\Test\\HMS.db"; 
		  conn = DriverManager.getConnection(url);
		  Statement stmt = conn.createStatement();  
		  String sql = "SELECT * FROM PATIENT";
          ResultSet rs = stmt.executeQuery(sql);
         
           while (rs.next()) {  
               System.out.println(rs.getInt("ID") +  "\t" +   
                                  rs.getString("NAME") + "\t" +  
                                  rs.getString("ADDRESS") + "\t" +
                                  rs.getString("COMPLAINT") + "\t" + 
                                  rs.getDouble("AMOUNT") + "\t" +
                                  rs.getInt("CONTACT") + "\t" + 
                                  rs.getString("DOCTOR") + "\t" +
                                  rs.getString("ADMIT_DATE") + "\t" + 
                                  rs.getString("DIS_DATE"));  
           }  
	  }
	
	  public static void connect() {  
	        Connection conn = null;  
	        try {  
	            // db parameters  
	            String url = "jdbc:sqlite:E:\\workspace\\Test\\HMS.db";  
	            // create a connection to the database  
	            conn = DriverManager.getConnection(url);  
	              
	            System.out.println("Connection to SQLite has been established."); 
	            
//	           String sql = "CREATE TABLE IF NOT EXISTS employees (\n"  
//	                    + " id integer PRIMARY KEY,\n"  
//	                    + " name text NOT NULL,\n"  
//	                    + " capacity real\n"  
//	                    + ");";  
//	             
	           
	           String sql = "CREATE TABLE PATIENT(\r\n" + 
	           		"   ID INTEGER PRIMARY KEY AUTOINCREMENT,\r\n" + 
	           		"   NAME           TEXT      NOT NULL,\r\n" + 
	           		"   ADDRESS        TEXT,\r\n" + 
	           		"   COMPLAINT      TEXT,\r\n" + 
	           		"   AMOUNT		  REAL,\r\n" + 
	           		"   CONTACT		  INT,\r\n" + 
	           		"   DOCTOR		  TEXT,\r\n" + 
	           		"   ADMIT_DATE     TEXT,\r\n" + 
	           		"   DIS_DATE       TEXT\r\n" + 
	           		");";
	           
	            
	            
	            //String sql = "INSERT INTO employees(id, name, capacity) VALUES('3','sf','234234')";
	            Statement stmt = conn.createStatement();  
	           // ResultSet rs = stmt.executeQuery(sql);
	            stmt.execute(sql);
	           
	            
	            System.out.println("Table successfully created..");
	              
	        } catch (SQLException e) {  
	            System.out.println(e.getMessage());  
	        } finally {  
	            try {  
	                if (conn != null) {  
	                    conn.close();  
	                }  
	            } catch (SQLException ex) {  
	                System.out.println(ex.getMessage());  
	            }  
	        }  
	    }  
	    
	  static void  insert() throws SQLException {
		  Connection conn = null; 
		  String url = "jdbc:sqlite:E:\\workspace\\Test\\HMS.db"; 
		  conn = DriverManager.getConnection(url);
		  Statement stmt = conn.createStatement();  
		  String sql = "INSERT INTO PATIENT( NAME,ADDRESS, COMPLAINT, AMOUNT,CONTACT, DOCTOR,ADMIT_DATE,DIS_DATE) "
		  		                    + "VALUES('asas','bbsr','ent','500','9111110121','pqr','20-09-2018','25-09-2018')";
          stmt.execute(sql);
          System.out.println("Data inserted successfully");
	  }
	  
	  
	    public static void main(String[] args) throws SQLException {  
	        //connect();
	        insert();
	    	selectQuery();
	    } 
}

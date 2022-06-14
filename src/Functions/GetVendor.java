/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class GetVendor {

    /**
     * @param args the command line arguments
     */
    static final String DB_URL = "jdbc:sqlserver://localhost;databaseName=ClothingMgmtSvr;user=sa;password=sa";
    public static void main(String[] args) {
        Connection conn = null;
   Statement stmt = null;
   try {
     //Open a connection
     System.out.println("Connecting to database...");
     conn = DriverManager.getConnection(DB_URL);
     //Execute a query
     System.out.println("Creating statement...");
     stmt = conn.createStatement();
     String sql = "INSERT INTO vendor VALUES ('V003', '7 Nguyen Trai');";
     int rows = stmt.executeUpdate(sql);
     System.out.println("Rows impacted : " + rows);
     // Let us select all the records and display them.
     sql = "SELECT v#, adress from vendor";
     ResultSet rs = stmt.executeQuery(sql);
     //Extract data from result set
     while (rs.next()) {
       //Retrieve by column name
       String id = rs.getString("v#");
       String address = rs.getString("adress");
       //Display values
       System.out.println("ID: " + id);
       System.out.println("Address: " + address);
     }
     //Clean-up environment
     rs.close();
     stmt.close();
     conn.close();
   } catch (SQLException se) {
     //Handle errors for JDBC
     se.printStackTrace();
   } finally {
     //finally block used to close resources
     try {
       if (stmt != null) {
         stmt.close();
       }
     } catch (SQLException se2) {
     }// nothing we can do
     try {
       if (conn != null) {
         conn.close();
       }
     } catch (SQLException se) {
         se.printStackTrace();
     }//end finally try
    }//end try
   System.out.println("Done!");
 }
        // TODO code application logic here
    }
    


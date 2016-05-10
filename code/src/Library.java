
import java.awt.*;

import javax.swing.*;

import java.sql.*;
import java.io.*;
public class Library {
	static Connection conn = null;
	/**
	 * @param args
	 */
	
	public int Connection1(String query){
			String url = "jdbc:mysql://localhost:3306/Library"; // direct connect to database in url
			String user = "root";
			String password = "abc123";
			
			try {
				conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();
				int affectedrows = stmt.executeUpdate(query);
				conn.close();
				return affectedrows;
				} 
			//System.out.println("Success!!"); 
			catch(SQLException ex) {
				System.out.println("Error in connection: " + ex.getMessage());
				return 0;
			}finally{
				if(conn != null){
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
	}
	public ResultSet Connection(String query) {
		
		/* Initialize variables for login creds */
		String url = "jdbc:mysql://localhost:3306/Library"; // direct connect to database in url
	//	String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "abc123";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				return rs;
			} 

		// Always close the recordset and connection.
		/*	rs.close();
		//	conn.close();
		//	System.out.println("Success!!"); */
		catch(SQLException ex) {
			System.out.println("Error in connection: " + ex.getMessage());
			return null;
		}
		
		
	}
		public static void main(String[] args){
	        
		}
}

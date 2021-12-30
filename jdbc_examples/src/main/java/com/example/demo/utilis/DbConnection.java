package com.example.demo.utilis;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
public class DbConnection {

	public static Connection getOracleConnection() {
		Connection con =null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Properties props= new Properties();
//			con =DriverManager.
//					getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV", "HR", "HR");
			
			InputStream inStream = DbConnection.class.getClassLoader().
					getResourceAsStream("DbConnection.properties");
			
			props.load(inStream);
			con=DriverManager.getConnection(
					props.getProperty("datasource.url"), 
					props.getProperty("datasource.userName"), 
					props.getProperty("datasource.password"));
			
		} catch (SQLException | ClassNotFoundException | IOException e) {
			
			e.printStackTrace();
		} 
		return con;
	}
}

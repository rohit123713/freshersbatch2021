package com.example.demo.utilis;

import java.sql.*;

import com.example.demo.enums.DatabaseName;
public class Connectionfactory {

	public static Connection getConnection(DatabaseName key) {
		
		switch(key) {
		case ORACLE:
			return DbConnection.getOracleConnection();
		case POSTGRES:
			return DbConnection.getPostgresConnection();
		default:
			return null;
		}
	}
	
}

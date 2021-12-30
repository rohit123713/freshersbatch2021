package com.example.demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.utilis.DbConnection;

public class OneToManyQuery {

	public static void main(String[] args) {
		
		Connection con=DbConnection.getOracleConnection();

		String sql="select doc.doctorname,doc.doctorId,pat.patientname,pat.address from doctor_rohit2 doc,patient_rohit pat where doc.doctorId = pat.doctorref";
		String sql2="create table hotel_master_rohit2(Year1 number(3),Hostel_name varchar(20) constraint hostelmaster2_pk Primary key,warden_name varchar2(20))";
		List<Patient> pat=new ArrayList<Patient>();
		try(PreparedStatement pstmt = con.prepareStatement(sql2)) {
			
			
			//ResultSet rs=pstmt.executeQuery();
			pstmt.execute();
//			while(rs.next()) {
//				System.out.println(rs.getString(1)+rs.getInt(2) +
//						rs.getString(3) + rs.getString(4));
////				Patient patient=new Patient(1,rs.getString(3),rs.getString(4),105);
////				System.out.println(patient);
////				
////				
////				pat.add(patient);
//			}
			
		//pat.forEach(System.out::println);

			
			
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

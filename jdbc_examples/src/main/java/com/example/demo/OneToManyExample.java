package com.example.demo;

import java.util.*;

import com.example.demo.entity.oneto.many.Doctor;
import com.example.demo.utilis.DbConnection;

import java.sql.*;
public class OneToManyExample {

	public static void main(String[] args) {
		
		Connection con= DbConnection.getOracleConnection();
		
		String sql1 = "insert into doctor_rohit2 values(?,?,?,?,?,?)";
		String sql2 = "insert into patient_rohit values(?,?,?,?)";
		int rowAdded=0;
		
		try(PreparedStatement pstmt = con.prepareStatement(sql1);
				PreparedStatement pstmt2 = con.prepareStatement(sql2)){
			
			Patient ram= new Patient(2021,"ram","chennai",101);
			Patient shyam= new Patient(2022,"shyam","Mumbai",102);
			
			ArrayList<Patient> patientList =new ArrayList<Patient>();
			
			patientList.add(ram);
			patientList.add(shyam);
			
			Doctor t=new Doctor(42,"siva",474747,"shiv@abc.com","ent","kadiri",patientList);
			
			pstmt.setInt(1, t.getDoctorId());
			pstmt.setString(2, t.getDoctorName());
			pstmt.setLong(3, t.getHandPhone());
			pstmt.setString(4, t.getEmail());
			pstmt.setString(5, t.getSpecialization());
			pstmt.setString(6, t.getCity());
			

			rowAdded = pstmt.executeUpdate();
			
			List<Patient> patList=t.getPatientList();
			
			for(Patient eachPatient:patList) {
				
				pstmt2.setInt(1, eachPatient.getPatientId());
				pstmt2.setString(2, eachPatient.getPatientName());
				pstmt2.setString(3, eachPatient.getAddress());
				pstmt2.setInt(4, eachPatient.getDoctorRef());
				
				int rowAdded2=pstmt2.executeUpdate();
			}
			
				
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
	}
}

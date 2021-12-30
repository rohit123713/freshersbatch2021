package com.example.demo.daos;

import java.util.*;
import java.sql.*;

import com.example.demo.entity.Doctor;
import com.example.demo.ifaces.CrudRepository;
import com.example.demo.ifaces.DoctorRepository;

public class DoctorDao implements DoctorRepository<Doctor> {

	private Connection con;
	
	
	public DoctorDao(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int add(Doctor t) {


		String sql = "insert into doctor_rohit2 values(?,?,?,?,?,?)";
		int rowAdded=0;
		
        try(PreparedStatement pstmt = con.prepareStatement(sql)) {	
			
			pstmt.setInt(1, t.getDoctorId());
			pstmt.setString(2, t.getDoctorName());
			pstmt.setLong(3, t.getHandPhone());
			pstmt.setString(4, t.getEmail());
			pstmt.setString(5, t.getSpecialization());
			pstmt.setString(6, t.getCity());
			
	
			 rowAdded = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO: handle exception
		}
		return rowAdded;
	}

	@Override
	public List<Doctor> findAll() {
		
		String sql = "select * from doctor_rohit2";
		
		List<Doctor> docList = new ArrayList<Doctor>();
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			//rs contains all records present in the database
			ResultSet rs= pstmt.executeQuery();
			
			while(rs.next()) {
				
				int doctorId = rs.getInt("doctorId");
				String city = rs.getString("city");
				String doctorName= rs.getString("doctorName");
				String email= rs.getString("email");
				long handPhone = rs.getLong("handPhone");
				String specialization = rs.getString("specialization");
				
				Doctor found = new Doctor(doctorId, doctorName, handPhone, email, specialization, city);
				
				docList.add(found);
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
			
		return docList;
	}
	
	


	@Override
	public Doctor findById(int pkey) {
		
		String sql= "select * from doctor_rohit2 where doctorId=?";
		
		Doctor found=null;
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, pkey);
			
			ResultSet rs= pstmt.executeQuery();
			
			if(rs.next()) {
				found= mapResultSetToDoctor(rs);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return found;
	}

	@Override
	public int update(Doctor t) {
		
		int pkey=t.getDoctorId();
		
		Doctor rowFound=findById(pkey);
		int rowUpdated=0;
		if(rowFound==null) {
			System.out.println("Element Not Found Hence Adding Element");
			add(t);
		}
		else {
			System.out.println("Element Found can be updated");
			
			String sql = "update doctor_rohit2 set doctorName=?,city=?,email=?,handPhone=?,specialization=? where doctorId=?";
            
			try(PreparedStatement pstmt = con.prepareStatement(sql)) {
				
				pstmt.setString(1, t.getDoctorName());
				pstmt.setString(2, t.getCity());
				pstmt.setString(3, t.getEmail());
				pstmt.setLong(4, t.getHandPhone());
				pstmt.setString(5, t.getSpecialization());
				pstmt.setInt(6, t.getDoctorId());
				
				rowUpdated=pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowUpdated;
	}

	@Override
	public int deleteById(int pkey) {
        String sql= "delete from doctor_rohit2 where doctorId=?";
		
        
        int rowDeleted=0;
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, pkey);
			rowDeleted = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowDeleted;
	}
	
	
	private Doctor mapResultSetToDoctor(ResultSet rs) throws SQLException {
		
		int doctorId = rs.getInt("doctorId");
		String city = rs.getString("city");
		String doctorName= rs.getString("doctorName");
		String email= rs.getString("email");
		long handPhone = rs.getLong("handPhone");
		String specialization = rs.getString("specialization");
		
		Doctor found = new Doctor(doctorId, doctorName, handPhone, email, specialization, city);
		return found;
	}

	@Override
	public List<Doctor> findByCity(String CityName) {
		
        String sql= "select * from doctor_rohit2 where city=?";
		
        List<Doctor> doc=new ArrayList<Doctor>();
		Doctor found=null;
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, CityName);
			
			ResultSet rs= pstmt.executeQuery();
			
			while(rs.next()) {
				found= mapResultSetToDoctor(rs);
				doc.add(found);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

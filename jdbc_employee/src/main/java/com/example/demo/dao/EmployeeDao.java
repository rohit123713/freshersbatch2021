package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;

import com.example.demo.Entity.Employee;
import com.example.demo.ifaces.EmployeeRepository;
import com.example.demo.services.NameCheckException;

public class EmployeeDao implements EmployeeRepository<Employee>{

	private Connection con;
	
	
	public EmployeeDao(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int add(Employee t) {
		
		String sql="insert into rohitemployee values(?,?,?,?,?,?,?,?)";
		int rowAdded=0;
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setInt(1, t.getEmployeeId());
			pstmt.setString(2, t.getFirstName());
			pstmt.setString(3,t.getLastName());
			pstmt.setString(4,t.getAddress());
			pstmt.setString(5, t.getEmail_Address());
			pstmt.setLong(6, t.getPhone_Number());
			pstmt.setDate(7, t.getBirthday());
			pstmt.setDate(8, t.getWedding_Anniversary());
			
			rowAdded=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowAdded;
	}

	@Override
	public Employee findByName(String emp_name) throws NameCheckException{
		String sql="select * from rohitemployee where firstName=?";
		Employee emp=null;
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setString(1, emp_name);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next()) {
				emp=mapResultSetToEmployee(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Employee> findAll() {
		String sql = "select firstName,phonenumber from rohitemployee";
		List<Employee> empList = new ArrayList<Employee>();
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			System.out.println(pstmt.getClass().getName());
			//rs contains all records present in the database
			ResultSet rs= pstmt.executeQuery();
			
			while(rs.next()) {
				
				//int employeeId=rs.getInt("employee_id");
				String firstName=rs.getString("firstName");
				//String lastName=rs.getString("lastName");
				//String address=rs.getString("address");
				//String email_Address=rs.getString("email_address");
				long phone_Number=rs.getLong("phonenumber");
				//Date birthday=rs.getDate("birthday");
				//Date wedding_Anniversary=rs.getDate("wedding_anniversary");
				
				Employee found=new Employee(firstName, phone_Number);
				
				empList.add(found);
				
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
			
		return empList;
	}

	@Override
	public int update(Employee t) {
		
		String sql="update rohitemployee set firstName=?,lastName=? where employee_id=?";
		int rowUpdate=0;
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setString(1, t.getFirstName());
			pstmt.setString(2, t.getLastName());
			pstmt.setInt(3, t.getEmployeeId());
			
			rowUpdate=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowUpdate;
	}

	@Override
	public List<Employee> findBybirthday(Date date) {
		String sql="select * from rohitemployee where birthday=?";
		Employee emp=null;
		
		List<Employee> empList = new ArrayList<Employee>();
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setDate(1, date);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next()) {
				emp=mapResultSetToEmployee(rs);
				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public List<Employee> findByweddinganniversary(Date date) {
		String sql="select * from rohitemployee where wedding_anniversary=?";
		Employee emp=null;
		List<Employee> empList = new ArrayList<Employee>();
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setDate(1, date);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next()) {
				emp=mapResultSetToEmployee(rs);
				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}

   private Employee mapResultSetToEmployee(ResultSet rs) throws SQLException {
		
		int employeeId = rs.getInt("Employee_Id");
		String firstName = rs.getString("firstName");
		String lastName= rs.getString("lastName");
		String address= rs.getString("address");
		String email_Address= rs.getString("email_address");
		long phone_Number = rs.getLong("Phonenumber");
		Date birthday=rs.getDate("birthday");
		Date wedding_Anniversary=rs.getDate("wedding_anniversary");
		
		Employee found = new Employee(employeeId, firstName, lastName, address, email_Address, phone_Number, birthday, wedding_Anniversary);
		return found;
	}
	
}

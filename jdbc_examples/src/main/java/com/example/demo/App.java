package com.example.demo;

import com.example.demo.daos.DoctorDao;
import com.example.demo.entity.Doctor;
import com.example.demo.enums.DatabaseName;
import com.example.demo.ifaces.CrudRepository;
import com.example.demo.ifaces.DoctorRepository;
import com.example.demo.utilis.Connectionfactory;
import com.example.demo.utilis.DbConnection;
import java.sql.*;
import java.util.List;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //Connection conn=Connectionfactory.getConnection(2);
        Connection conn=Connectionfactory.getConnection(DatabaseName.POSTGRES);
        System.out.println(DbConnection.getOracleConnection());
        
        Connection con=DbConnection.getOracleConnection();
        DoctorRepository<Doctor> repo = new DoctorDao(conn);
        
        int key=1;
        switch(key) {
        
        case 1:
        
        //find all the data
        
        repo.findAll().forEach(System.out::println);
        break;
        
        case 2:
        Doctor doc= new Doctor(110,"ranju",900232,"ravi@abc.com",
        		"dentist","karaikudi");
        int rowadded=repo.add(doc);
        
        if(rowadded==1) {
        System.out.println(rowadded);
        System.out.println("1 row inserted");
        }
        else {
        	System.out.println("0 row inserted");
        }
        break;
        
        case 3:
        Doctor found = (Doctor) repo.findById(101);
        System.out.println(found);
        break;
        
        case 4:
        	int rowDeleted= repo.deleteById(104);
        	
        	if(rowDeleted==1) {
	        System.out.println(rowDeleted);
	        System.out.println("1 row deleted");
	        }
	        else {
	        	System.out.println("0 row deleted");
	        }
        case 5:
        	Doctor docToSrch= new Doctor(110,"ranju",900232,"rang@abc.com",
               		"dentist","puducherry");
        	int rowUpdated=repo.update(docToSrch);
        	System.out.println("Row updated:=" + rowUpdated);
        	break;
        
        case 6:
        	String city="nellore";
        	
        	 List<Doctor> found1 =  repo.findByCity(city);
             found1.forEach(System.out::println);
        default:
        	break;
        }
        
        
        
        
        
        
        
        
        
    }
}

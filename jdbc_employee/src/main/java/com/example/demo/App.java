package com.example.demo;

import java.sql.Connection;
import java.sql.Date;
import java.time.*;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.Entity.Employee;
import com.example.demo.dao.EmployeeDao;
import com.example.demo.enums.DatabaseName;
import com.example.demo.ifaces.EmployeeRepository;
import com.example.demo.services.NameCheckException;
import com.example.demo.utilis.Connectionfactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int key=2;
        Connection con=Connectionfactory.getConnection(DatabaseName.POSTGRES);
    	EmployeeRepository<Employee> repo=new EmployeeDao(con);
    	
        switch(key){
        case 1:
        	Employee emp=new Employee(101, "ravi", "k", "chennai", "ravi@abc.com", 98210, 
        			Date.valueOf(LocalDate.of(1998, 06, 25)),  
        			Date.valueOf(LocalDate.of(2026, 05, 28)));
        	int rowAdded=repo.add(emp);
        	
        	System.out.println("RowAdded:" + rowAdded);
        	break;
        case 2:
        	try {
				Employee emp1=repo.findByName("ravia");
				
				System.out.println(emp1);
			} catch (NameCheckException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	break;
        case 3:
        	Employee emp2=new Employee(101, "rakesh", "t", "chennai", "ravi@abc.com");
             
        	int rowUpdate=repo.update(emp2);
        	System.out.println("rowUpdated = "+rowUpdate);
        	break;
        case 4:
        	List<Employee> emp3=repo.findBybirthday(Date.valueOf(LocalDate.of(2000, 06, 25)));
        	
        	//System.out.println(emp3);
        	emp3.forEach(System.out::println);
        	Map<String, String> mapList = emp3.stream().collect(Collectors.toMap(Employee::getFirstName, Employee::getEmail_Address));
			Set<Entry<String, String>> setView = mapList.entrySet();
			for (Entry<String, String> list : setView) {
				System.out.println("firstname- " + list.getKey() + "\n" + "email- " + list.getValue());
			}
			break;
       
        case 5:
        	List<Employee> emp4=repo.findByweddinganniversary(Date.valueOf(LocalDate.of(2026, 05, 28)));
        	
        	//System.out.println(emp4);
        	emp4.forEach(System.out::println);
        	
			Map<String, Long> mapList1 = emp4.stream()
					.collect(Collectors.toMap(Employee::getFirstName, Employee::getPhone_Number));
			Set<Entry<String, Long>> setView2 = mapList1.entrySet();
			for (Entry<String, Long> list : setView2) {
				System.out.println("firstname- " + list.getKey() + "\n" + "Phonenumber- " + list.getValue());
			}
        	break;
        	
        case 6:
        	List<Employee> listofEmps=repo.findAll();

        	listofEmps.forEach(System.out::println);
        	
        	Map<String, Long> mapList2 = listofEmps.stream()
					.collect(Collectors.toMap(Employee::getFirstName, Employee::getPhone_Number));
			Set<Entry<String, Long>> setView3 = mapList2.entrySet();
			for (Entry<String, Long> list : setView3) {
				System.out.println("firstname- " + list.getKey() + "\n" + "Phonenumber- " + list.getValue());
			}
        	break;
        }
    }
}

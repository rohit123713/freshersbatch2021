package com.example.demo;

import com.example.demo.services.Service;
import com.example.ifaces.CrudRepository;
import com.example.model.Doctor;
import com.example.model.Patient;
import com.example.model.Staff;

import java.util.*;

public class Application {
	
  public static void print(List<Doctor> list) {
		
		Iterator<Doctor> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
	}
  }
	public static void main(String[] args) {
	
		  
		  Patient patient1= new Patient(24,"ragesh","vandalur","abc@gmail.com");
		  Patient patient2= new Patient(25,"raghul","vandalur","xyz@gmail.com");
		  Patient patient3 = new Patient(26,"ravi","ariyalur","tru@gmail.com");
		  Patient patient4 = new Patient(27,"sai","mangalam","ryf@gmail.com");
		  
		  Set<Patient> patients= new HashSet<Patient>();
		  patients.add(patient1);
		  patients.add(patient2);
		  patients.add(patient3);
		  patients.add(patient4);
		  
		  System.out.println("*******");
		  for(Patient patient:patients) {
			  System.out.println(patient.getAddress() + patient.getEmail());
		  }
		  Staff staff1 = new Staff(34,"sailesh",4757348,12000);
		  Staff staff2 = new Staff(35,"ramu",47573866,10000);
		  Staff staff3 = new Staff(36,"ravi",4757338,8000);
		  Staff staff4 = new Staff(37,"foresh",4757238,8000);
		  
		  Map<String, Staff> staffs = new HashMap<String, Staff>(); 
		  
		  staffs.put("Engineer", staff1);
		  staffs.put("Consultant", staff2);
		  staffs.put("Advisor", staff3);
		  staffs.put("Designer", staff4);
		  
			Set<Map.Entry<String, Staff>> studSet = staffs.entrySet();
			
			//use For each loop and print
			System.out.println("*******");
			for(Map.Entry<String, Staff> obj: studSet) {
				System.out.println(obj.getKey());
				System.out.println(obj.getValue());
			}
		  
		  Doctor doctor1= new Doctor(123,"shiva","eyedoctor","Chennai",patients,staffs);
		  
          CrudRepository<Doctor> repo = new Service();
          
 
          
          repo.add(doctor1);
          System.out.println(doctor1.getPatientList());
          System.out.println("*******");
          System.out.println(doctor1.getStaffdetails());
          System.out.println("*******");
         
          
          repo.updateDesignation(doctor1, "heartdoctor");
         
          repo.remove(doctor1);
          print(repo.findAll());
          System.out.println("Is removed");
	}

}

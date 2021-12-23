package com.example.service;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.*;

import com.example.model.Doctor;
import com.example.util.Doctor_Util;

public class Doctorservice {

	Doctor_Util util = new Doctor_Util();
	File file1 = new File("doctor.txt");
	public boolean writeTofile(Doctor doctor,File file) {
		boolean result = false;
		
		try(PrintWriter writer= new PrintWriter(new FileWriter(file,true))) {
			writer.println(doctor);
			
			result=true;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public Collection<Doctor> readTofile(File file) {
		List<Doctor> list = new ArrayList<Doctor>();
		
		String line = null;
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			while((line = reader.readLine())!=null){
				
				String[] values= line.split(",");
				
				int id = Integer.parseInt(values[0]);
				String name = values[1];
				String specialization = values[2];
				String location = values[3];
				
				Doctor doc = new Doctor(id, name, specialization, location);
				list.add(doc);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	// doctors with specialization
	public List<Doctor> listofdoctorswithspecialization(String specialization){
		
		//Collection<Doctor> docList1 = readTofile(file1);
		List<Doctor> docList=util.getDoctorsList();
		Predicate<Doctor> condition = 
				doctor -> doctor.getSpecialization().equals(specialization);
		List<Doctor> list2=docList.stream().filter(condition).collect(toList());
		return list2;
		
	}
	
	// doctors with location
   public List<Doctor> listofdoctorswithlocation(String location){
		
	 //Collection<Doctor> docList1 = readTofile(file1);
		List<Doctor> docList=util.getDoctorsList();
		Predicate<Doctor> condition = 
				doctor -> doctor.getLocation().equals(location);
		List<Doctor> list2=docList.stream().filter(condition).collect(toList());
		return list2;
		
	}
// doctors with location and specialization
   public List<Doctor> listofdoctors(String location,String specializaton){
		
	 //Collection<Doctor> docList1 = readTofile(file1);
		List<Doctor> docList=util.getDoctorsList();
		Predicate<Doctor> condition = 
				doctor -> doctor.getLocation().equals(location);
		Predicate<Doctor> condition2 = 
				doctor -> doctor.getSpecialization().equals(specializaton);
		List<Doctor> list2=docList.stream().filter(condition).filter(condition2).collect(toList());
		return list2;
		
	}
   
// doctors with location and specialization alternate method
   public List<Doctor> listofdoctors2(String location,String specializaton){
	
		List<Doctor> listServices1 = 
				listofdoctorswiths("eyedoctor",
						doctor -> doctor.getSpecialization().equals("eyedoctor"));
		Predicate<Doctor> condition = 
				doctor -> doctor.getLocation().equals(location);

		List<Doctor> list2=listServices1.stream().filter(condition).collect(toList());
		return list2;
		
	}
   
// doctors with specialization and // doctors with location combined
   public List<Doctor> listofdoctorswiths(String specialization,Predicate<Doctor> condition2){
		
	 //Collection<Doctor> docList1 = readTofile(file1);
		List<Doctor> docList=util.getDoctorsList();
		Predicate<Doctor> condition = 
				doctor -> doctor.getSpecialization().equals(specialization);
		List<Doctor> list2=docList.stream().filter(condition2).collect(toList());
		return list2;
		
	}
}

package com.example.demo;

import com.example.model.Doctor;
import com.example.service.Doctorservice;
import java.io.*;
import java.util.Collection;

import java.util.List;
import java.util.Scanner;
public class Application {

	public static String common(boolean result) {
		if(result) {
			return "File Created and Record Added";
		}else {
			return "Exception -check the console";
		}
	}
	public static void main(String[] args) {
		Doctorservice service = new Doctorservice();
		File file = new File("doctor.txt");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the key values");
		int key = sc.nextInt();
		
		switch (key) {
		case 1: //write to file
			Doctor doc1= new Doctor(123,"sicky","eyedoctor","Chennai");
//			Doctor doc2= new Doctor(213,"vasu","eyedoctor","Chennai");
//			Doctor doc3= new Doctor(423,"saravan","heartdoctor","Guindy");
//			Doctor doc4= new Doctor(474,"vaishu","generaldoctor","Vadapalani");
//			Doctor doc5= new Doctor(823,"fary","heartdoctor","Guindy");
//			Doctor doc6= new Doctor(674,"dhanush","generaldoctor","Vadapalani");
			boolean result = service.writeTofile(doc1, file);
			System.out.println(common(result));
			break;

		case 2: //read from file
			Collection<Doctor> listservice = service.readTofile(file);
			listservice.forEach(System.out::println);
			break;
		case 3:
			List<Doctor> listServicespec = 
			service.listofdoctorswithspecialization("eyedoctor");
			listServicespec.forEach(System.out::println);
			break;
			
		case 4:
			List<Doctor> listServiceloc = 
			service.listofdoctorswithlocation("Guindy");
			listServiceloc.forEach(System.out::println);
			break;
		
		case 5:
			List<Doctor> doctors=
			service.listofdoctors("Chennai", "eyedoctor");
			doctors.forEach(System.out::println);
			break;
		
		case 6:
			List<Doctor> listServices1 = 
			service.listofdoctorswiths("eyedoctor",
					doctor -> doctor.getSpecialization().equals("eyedoctor"));
			listServices1.forEach(System.out::println);
			
			List<Doctor> listServices2 = 
					service.listofdoctorswiths("Guindy",
							doctor -> doctor.getLocation().equals("Guindy"));
					listServices2.forEach(System.out::println);
			break;
			
		case 7:
			List<Doctor> listOFservice=
			service.listofdoctors2("Chennai", "eyedoctor");
			listOFservice.forEach(System.out::println);
			break;
		default:
			break;
		}
      sc.close();
	}

}

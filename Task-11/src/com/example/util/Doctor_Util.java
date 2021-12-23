package com.example.util;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Doctor;

public class Doctor_Util {

	public List<Doctor> getDoctorsList () {

		List<Doctor> docList= new ArrayList<Doctor>();
		
		Doctor doc1= new Doctor(123,"sicky","eyedoctor","Chennai");
		Doctor doc2= new Doctor(213,"vasu","eyedoctor","Chennai");
		Doctor doc7= new Doctor(564,"vadivelu","eyedoctor","Cuddalore");
		Doctor doc3= new Doctor(423,"saravan","heartdoctor","Guindy");
		Doctor doc4= new Doctor(474,"vaishu","generaldoctor","Vadapalani");
		Doctor doc5= new Doctor(823,"fary","heartdoctor","Guindy");
		
		docList.add(doc1);
		docList.add(doc2);
		docList.add(doc3);
		docList.add(doc4);
		docList.add(doc5);
		docList.add(doc7);
		
		return docList;
	}
}

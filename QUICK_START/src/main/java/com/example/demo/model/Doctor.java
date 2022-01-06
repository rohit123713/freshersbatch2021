package com.example.demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

//@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@ToString
@Data  //@Data=@NoArgsConstructor,@Getter,@Setter etc..,
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Doctor {

	int doctorId;
	String doctorName;
	String location;
	
	//Collaborating Object
	Patient patient;
}



















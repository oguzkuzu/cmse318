package pack;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;

import java.io.InputStreamReader;

import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;





public class Student {

	

	//put your own text path C:\\Users\\kiana\\Documents\\GitHub\\cmse318_workspace/Assignment_1/students.txt 

	File f = new File("C:\\Users\\ABRA\\workspace\\Assignment_1/students.txt");

	private String studentId;

	private String name;

	private String lastName;

	private int birthYear;

	private String sex;

	private String countryOfBirth;



	
		
	  public Student(String studentId, String name, String lastName, int birthYear, String sex,

			String countryOfBirth) {



		this.studentId = studentId;

		this.name = name;

		this.lastName = lastName;

		this.birthYear = birthYear;

		this.sex = sex;

		this.countryOfBirth = countryOfBirth;

	} 
	  
	  //empty constructor
	  public Student() {
		  
		this.studentId = "00000000";

		this.name = "EMPTY";

		this.lastName = "EMPTY";

		this.birthYear = 0000;

		this.sex = "NULL";

		this.countryOfBirth = "WORLD";

	} 

	  

	

	// Getters
	String getstudentId() {

		// TODO Auto-generated method stub

		return studentId;

	}

	String getName() {

		// TODO Auto-generated method stub

		return name;

	}

	String getLastName() {

		// TODO Auto-generated method stub

		return lastName;

	}

	int getBirthYear() {

		// TODO Auto-generated method stub

		return birthYear;

	}

	String getSex() {

		// TODO Auto-generated method stub

		return sex;

	}

	String getCountryOfBirth() {

		// TODO Auto-generated method stub

		return countryOfBirth;

	}

	
	// Setters
	void setstudentId(String studentId) {

		this.studentId = studentId;

	}

	void setName(String name) {

		this.name = name;

	}

	void setLastName(String lastName) {

		this.lastName = lastName;

	}

	void setBirthYear(int birthYear) {

		this.birthYear = birthYear;

	}

	void setSex(String sex) {

		this.sex = sex;

	}

	void setCountryOfBirth(String countryOfBirth) {

		this.countryOfBirth = countryOfBirth;

	}




	
	

}
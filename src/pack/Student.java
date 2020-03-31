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





public class Student {

	

	//put your own text path

	File f = new File("C:\\Users\\kiana\\Documents\\GitHub\\cmse318_workspace/Assignment_1/students.txt");

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

	int birthYear() {

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


	// Functions

	public void saveAndWriteToTheFile(String studentId, String name, String lastName, int birthYear, String sex,

			String countryOfBirth) {

		try { 
			
			//Listenin sonunu bul. Ordan itibaren kay�t yap.

			BufferedWriter writer = new BufferedWriter(new  OutputStreamWriter(new FileOutputStream(f)));

			

			this.studentId = studentId;

			this.name = name;

			this.lastName = lastName;

			this.birthYear = birthYear;

			this.sex = sex;

			this.countryOfBirth = countryOfBirth;



			writer.newLine();

			writer.append(studentId + "          ");

			writer.append(name + "          ");

			writer.append(lastName + "          ");

			writer.append(birthYear + "          ");

			writer.append(sex + "          ");

			writer.append(countryOfBirth + "          ");

			writer.flush();

			

		} catch (FileNotFoundException e) {

			// TODO: handle exception

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		

	}

	public void readFromFile() {

		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));

			

			String s = reader.readLine();

			

			//System.out.println("Student Data: \n " + s);

			

			while (s != null) {

				s = reader.readLine();

				System.out.println("\n " + s);

			}

			

			

		} catch (Exception e) {

			// TODO: handle exception

		}

	}

	public void addStudent() {}
	
	public String findByStudentId(String studentId) {
	
		//dosyada arama i�lemi yapal�m
		//T�m info ve ��rencinin ya��n� d�nd�r.
		
		return null;
		
	}
	
	public String findContemporaryStudents (int birthYear) {
		
		// ayn� ya�takileri bul
		return null;
	}

	public void modifyStudentRecord(String studentId, String choice) {
		//studentId al + neyi editleyecekse onu al
		// switch case ile 
		/* case: "1" -> Id de�i�tir
		 * "2" -> ad de�i�tir.
		 * 
		 */
	}
	
	public void deleteStudentRecord(String studentId) {
		
		//delete by studentId
	}
	

}
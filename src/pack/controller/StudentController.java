package pack.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

import pack.model.Student;

public class StudentController {

	File f = new File("C:\\Users\\ABRA\\workspace\\Assignment_1/students.txt");
	private Student[] studentArray;

	// constructor
	public StudentController(Student[] studentArray) {
		this.studentArray = studentArray;
	}

	public void initialize(Student studentArray[]) {
		for (int i = 0; i < 100; i++) {
			studentArray[i] = new Student();
		}
	}

	public Student scanInformationAndCreateTheStudentObject(Student st) {

		// st objesinin ozelliklerini scanner ile alip st adli Student objesini
		// dolduralim.
		System.out.println("Now tell me the student info one by one");

		System.out.println("Student ID ? ");
		Scanner scan = new Scanner(System.in);
		st.setstudentId(scan.nextLine());

		System.out.println("Student NAME ? ");
		st.setName(scan.nextLine());

		System.out.println("Student LAST NAME? ");
		st.setLastName(scan.nextLine());

		System.out.println("Student BIRTH YEAR ? ");
		st.setBirthYear(Integer.parseInt(scan.nextLine()));

		System.out.println("Student SEX?  [M] for male & [F] for female");
		st.setSex(scan.nextLine());

		System.out.println("Student COUNTRY OF BIRTH? ");
		st.setCountryOfBirth(scan.nextLine());

		return st;
	}

	public void addStudent(String studentId, String name, String lastName, int birthYear, String sex,

			String countryOfBirth) {

		try {

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true)));

			writer.newLine();

			writer.append(studentId + "          ");

			writer.append(name + "          ");

			writer.append(lastName + "          ");

			writer.append(birthYear + "          ");

			writer.append(sex + "          ");

			writer.append(countryOfBirth + "          ");

			writer.flush();

			writer.close();

		} catch (FileNotFoundException e) {

			// TODO: handle exception

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

	public void addStudent(Student[] studentArray, Student st) {

		System.out.println("\n Add student called");

		int i = getFirstEmptyElement(studentArray); // #0000 std no'ya sahip ilk elemaný kacinci indexte onu aldik.

		// indexi biliyoruz. st objesindeki degerleri dizideki o indexe kaydedelim.
		studentArray[i].setstudentId(st.getstudentId());
		studentArray[i].setName(st.getName());
		studentArray[i].setLastName(st.getLastName());
		studentArray[i].setBirthYear(st.getBirthYear());
		studentArray[i].setCountryOfBirth(st.getCountryOfBirth());
		studentArray[i].setSex(st.getSex());

		// java.io islemleri
		try {

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true)));

			// veri yazmaya baslamadan once writer.newLine() yap!!
			writer.newLine();

			writer.append(st.getstudentId() + "          ");

			writer.append(st.getName() + "          ");

			writer.append(st.getLastName() + "          ");

			writer.append(st.getBirthYear() + "          ");

			writer.append(st.getSex() + "          ");

			writer.append(st.getCountryOfBirth());

			writer.flush();

			writer.close();

		} catch (FileNotFoundException e) {

			// TODO: handle exception

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

	public void readFromFile() {

		System.out.println("\n Read from text file method running....");

	}

	// Maindeki students -> bir arraylist veya list. ama st tek bir students objesi.

	public String findByStudentId() {

		return null;

	}

	public String findContemporaryStudents(int birthYear) {

		// ayný yaþtakileri bul

		return null;
	}

	public void modifyStudentRecord(String studentId, String choice) {
		// studentId al + neyi editleyecekse onu al
		// switch case ile

		/*
		 * case: "1" -> Id deðiþtir "2" -> ad deðiþtir.
		 * 
		 * 
		 */
	}

	public void deleteStudentRecord(String studentId) {

		// delete by studentId
	}

	public int getFirstEmptyElement(Student[] studentArray) {
		int i;
		System.out.println("\n Get first empty element method running...");

		// 00000000 olan ilk satiri bulup addStudent methoduna gonderecegiz.

		for (i = 0; i < studentArray.length + 1; i++) {
			if (studentArray[i].getstudentId() == "00000000") {

				System.out.println("\n We find first #00000000 stdID in " + i + ". element");
				System.out.println("\n New data will be writed on the #" + i + ". index");

				return i;
			}
		}
		return i;
	}

	public void readArray(Student[] studentArray) {
		System.out.println("#" + "  Student ID     " + "Name      " + "Last Name    " + " ");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println("#" + i + "  " + studentArray[i].getstudentId() + "     " + studentArray[i].getName()
					+ "     " + studentArray[i].getLastName());
		}
	}

	// we should synchronize the text file and the studentArray!!!
	public void syncFileAndArray(Student st, Student[] studentArray) {

	}

}

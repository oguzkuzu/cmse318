package pack.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import pack.model.Student;
import pack.view.View;

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
		st.setBirthYear((scan.nextLine()));

		System.out.println("Student SEX?  [M] for male & [F] for female");
		st.setSex(scan.nextLine());

		System.out.println("Student COUNTRY OF BIRTH? ");
		st.setCountryOfBirth(scan.nextLine());

		return st;
	}

	/*
	 * 
	 * public void addStudent(String studentId, String name, String lastName, int
	 * birthYear, String sex,
	 * 
	 * String countryOfBirth) {
	 * 
	 * try {
	 * 
	 * BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new
	 * FileOutputStream(f, true)));
	 * 
	 * writer.newLine();
	 * 
	 * writer.append(studentId + "          ");
	 * 
	 * writer.append(name + "          ");
	 * 
	 * writer.append(lastName + "          ");
	 * 
	 * writer.append(birthYear + "          ");
	 * 
	 * writer.append(sex + "          ");
	 * 
	 * writer.append(countryOfBirth + "          ");
	 * 
	 * writer.flush();
	 * 
	 * writer.close();
	 * 
	 * } catch (FileNotFoundException e) {
	 * 
	 * // TODO: handle exception
	 * 
	 * } catch (IOException e) {
	 * 
	 * // TODO Auto-generated catch block
	 * 
	 * e.printStackTrace();
	 * 
	 * }
	 * 
	 * }
	 */
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

			writer.append(" \n" + st.getstudentId() + "          ");

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
		System.out.println("Student added successfully! \n");
		System.out.println("You're returning to menu....\n ");
		View.Menu(st, studentArray);
	}

	public void readFromFile() {

		System.out.println("\n Read from text file method running....");
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));

			String s = reader.readLine();

			System.out.println("Student Data: \n " + s);

			while (s != null) {

				s = reader.readLine();

				if (s == null) {
					System.out.println(" \n End of the document \n");
				} else

					System.out.println("\n " + s);

			}

			reader.close();

		} catch (Exception e) {

			// TODO: handle exception
			System.out.println("exception");

		}

	}

	public String findByStudentId(Student st, String studentId) {

		int i = 0;
		try {

			BufferedReader reader = new BufferedReader(new FileReader(f));
			String[] str;
			String fullString = "";
			String split = "          ";

			Path path = Paths.get("./students.txt"); // Here we get the line count of the text file.
			long lineCount = Files.lines(path).count();

			while ((fullString = reader.readLine()) != null) {

				for (i = 0; i < lineCount - 1; i++) { // lineCount used as loop condition

					fullString = reader.readLine();

					// Tüm satýr elimizde -> 17001836 Ata Kuzu 1994 m mersin

					str = fullString.split(split, 6);

					// System.out.println(Arrays.toString(str));

					for (int j = 0; j < 6; j++) {
						// System.out.println("#" + str[j]); Anlýk satýr bilgilerini yazýyor.

						if (str[j].contentEquals(studentId)) {
							System.out.println("");
							switch (j) {
							case 0:
								System.out.print("[" + studentArray[i].getstudentId() + "]");
							case 1:
								System.out.print("          " + studentArray[i].getName());
							case 2:
								System.out.print("          " + studentArray[i].getLastName());
							case 3:
								System.out.print("          " + studentArray[i].getBirthYear());
							case 4:
								System.out.print("          " + studentArray[i].getSex());
							case 5:
								System.out.print("          " + studentArray[i].getCountryOfBirth());
							}
						} else {
							//System.out.println("."); // if didnt satisfy so I put "." instead of student info
						}
					}
				}
			}
			reader.close();

		} catch (Exception e) {

			// TODO: handle exception
			System.out.println("exception");
			System.out.println(e);

		}
		System.out.println("\n You're returning to menu....\n ");
		View.Menu(st, studentArray);
		return "";
	}

	public String findContemporaryStudents(Student st, CharSequence birthYear) {
		int i = 0;
		try {

			BufferedReader reader = new BufferedReader(new FileReader(f));
			String[] str;
			String fullString = "";
			String split = "          ";

			Path path = Paths.get("./students.txt"); // Here we get the line count of the text file.
			long lineCount = Files.lines(path).count();

			while ((fullString = reader.readLine()) != null) {

				for (i = 0; i < lineCount - 1; i++) { // lineCount used as loop condition

					fullString = reader.readLine();

					// Tüm satýr elimizde -> 17001836 Ata Kuzu 1994 m mersin

					str = fullString.split(split, 6);

					// System.out.println(Arrays.toString(str));

					for (int j = 0; j < 6; j++) {
						// System.out.println("#" + str[j]); Anlýk satýr bilgilerini yazýyor.

						if (str[j].contains(birthYear)) {
									System.out.println("");
									System.out.print(studentArray[i].getstudentId());
									System.out.print("          " + studentArray[i].getName());
									System.out.print("          " + studentArray[i].getLastName());
									System.out.print("          " + "[" + studentArray[i].getBirthYear() + "]");
									System.out.print("          " + studentArray[i].getSex());
									System.out.print("          " + studentArray[i].getCountryOfBirth());
						} else {
							//System.out.println("."); // if didnt satisfy so I put "." instead of student info
						}
					}
				}
			}
			reader.close();

		} catch (Exception e) {

			// TODO: handle exception
			System.out.println("exception");
			System.out.println(e);

		}
		System.out.println(" \n You're returning to menu....\n ");
		View.Menu(st, studentArray);
		return "";
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
		System.out.println(
				"#" + "  Student ID     " + "Name     " + "Last Name    " + "Birth   " + " Sex    " + "Country ");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println("#" + i + "  " + studentArray[i].getstudentId() + "     " + studentArray[i].getName()
					+ "       " + studentArray[i].getLastName() + "       " + studentArray[i].getBirthYear() + "       "
					+ studentArray[i].getSex() + "       " + studentArray[i].getCountryOfBirth());
		}
	}

	// we should synchronize the text file and the studentArray at the beginning!!!
	public Student[] syncFileAndArray(Student st, Student[] studentArray) {
		int i = 0;
		try {

			BufferedReader reader = new BufferedReader(new FileReader(f));
			String[] str;
			String[] studentId = new String[100];
			String fullString = "";
			String split = "          ";

			Path path = Paths.get("./students.txt"); // Here we get the line count of the text file.
			long lineCount = Files.lines(path).count();

			while ((fullString = reader.readLine()) != null) {

				for (i = 0; i < lineCount - 1; i++) { // lineCount used as loop condition

//					System.out.println("\n *******");
//					System.out.println("i is: " + i + "\n");

					fullString = reader.readLine();

					// Tüm satýr elimizde -> 17001836 Ata Kuzu 1994 m mersin
					// Boþluklardan ayrýþtýrýp str dizisine geçirelim.
					str = fullString.split(split, 6);

					for (int j = 0; j < 6; j++) {
						// System.out.println("#" + str[j]); Anlýk satýr bilgilerini yazýyor.
						switch (j) {
						case 0:
							studentArray[i].setstudentId(str[j]);
						case 1:
							studentArray[i].setName(str[j]);
						case 2:
							studentArray[i].setLastName(str[j]);
						case 3:
							studentArray[i].setBirthYear(str[j]);
						case 4:
							studentArray[i].setSex(str[j]);
						case 5:
							studentArray[i].setCountryOfBirth(str[j]);
						}
					}

				}
			}
			reader.close();

		} catch (Exception e) {

			// TODO: handle exception
			System.out.println("exception");
			System.out.println(e);

		}
		return studentArray;

	}
}
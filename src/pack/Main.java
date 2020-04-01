package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
	Student st = new Student();
	StudentController studentController = new StudentController(st);
	ArrayList<Student> students = new ArrayList<>();
	Student studentArray[] = new Student[100];
	
	//initialize
	initialize(studentArray);
	
	//dolduraca��m�z zaman i�erideki fonksiyonda if stdId == "0000" ise diyip sonra yazd�rcaz bam bam
	// g�nderirkende findstdbyid(studentArray, stdId)
	studentController.addStudentToArray(studentArray,"17001836");
	
	// st objesinin ozelliklerini scanner ile alip st adli Student objesini dolduralim.
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
	
	
	// olu�turdu�umuz st objesini dosyaya yazmas� i�in controller'daki add studenti �a��rd�k
		studentController.addStudent(st);
		
	/*
	System.out.println("Write the id of student that you're looking for?");
	studentController.findByStudentId(students, scan.nextLine());
	*/
	
	
	
	
	// yazm�� m� bakal�m
	//studentController.readFromFile();
	
	
	
	/* students.forEach(student -> {
		System.out.println(student.getstudentId() + " " + student.getName() + " " + student.getLastName());
	});

	*/
	
}
	
	private static void initialize(Student studentArray[]) {
		for(int i = 0; i < 100; i++) {
			studentArray[i] = new Student();
		}
	}

	// menu();
	public static void Menu(Student[] s) {
		
		System.out.println(" 0 ��renci Numaras� ile ara.  1 \n ��renci silmek icin 2 \n Arama yapmak icin 3 ");
		//scannerla oku
		//s[0].findByStudentId("17001836");
		
		
		//switch-case 
		
		// case 1: �unu yap
		// case 2: bunu yap
		
		//default: tekrar men�y� g�ster
		
		
		
	}

	//initializes the student array. BUT not writes to the txt file.

	public static Student[] initStudents(Student[] s) {

		Student[] a = s;

		for (int i=0; i<100; i++) {

				a[i] = new Student("1","b","c", 0,"d","e");

			}

		return a;

		}

	

	

	//write to console

	public static void printAll(Student[] s) {

		Student[] a = s;

		for (int i = 0; i<100;i++) {
			
			System.out.print(a[i].getName());
			System.out.print(a[i].getLastName());
			System.out.println("");

			

		}

	}

	

	

	

}
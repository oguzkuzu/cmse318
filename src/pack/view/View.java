package pack.view;

import java.util.Scanner;

import pack.controller.StudentController;
import pack.model.Student;

public class View {

	static StudentController studentController;

	public View(StudentController studentController) {
		this.studentController = studentController;
	}

	// menu();
	public void Menu(Student st, Student[] studentArray, StudentController studentController) {
		Scanner scan = new Scanner(System.in);
		String choice = "";

		System.out.println(" \n ***** Menu **** \n #0 Add Student " + "\n #1 Search Student By ID "
				+ "\n #2 Modify A Students Record " + "\n #3 Show Contemporary Students. "
				+ "\n #4 Delete Student Record" + "\n #5 Exit ");
		choice = scan.nextLine();

		switch (choice) {

		case "0":
			st = studentController.scanInformationAndCreateTheStudentObject(st); // It gets input from user and parse in
																					// to st object
			studentController.addStudent(studentArray, st); // Sends the st object and array in order to write to file
		case "1":
			System.out.println("What's the student ID ?");
			String studentId = scan.nextLine();
			studentController.findByStudentId(studentId);
		case "2":
		case "3":
		case "4":
		case "5":
		}

	}

	public static void Menu(Student st, Student[] studentArray) {
		Scanner scan = new Scanner(System.in);
		int choice;

		System.out.println(" \n ***** Menu **** \n #0 Add Student " + "\n #1 Search Student By ID "
				+ "\n #2 Modify A Students Record " + "\n #3 Show Contemporary Students. "
				+ "\n #4 Delete Student Record" + "\n #5 Exit ");
		choice = Integer.parseInt(scan.nextLine());

		if (choice >= 0 && choice <= 5) {

			switch (choice) {
			case 0:
				st = studentController.scanInformationAndCreateTheStudentObject(st); // It gets input from user and
				studentController.addStudent(studentArray, st); // Sends the st object and array in order to write to
			case 1:
				System.out.println("What's the student ID ?");
				String studentId = scan.nextLine();
				System.out.println("looking for '" + studentId + "' ");
				studentController.findByStudentId(studentId);
			case 2:
			case 3:
				System.out.println("What's the birth year you are looking for?");
				String birthYear = scan.nextLine();
				System.out.println("looking for students who born in '" + birthYear + "' ....");
				studentController.findContemporaryStudents(birthYear);
			case 4:
			case 5: System.exit(0);
			}
		} else {
			System.out.println("Wrong input.. Run the program again.");
		}
	}
}

package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pack.controller.StudentController;
import pack.model.Student;
import pack.view.View;

public class Main {

	public static void main(String[] args) {
		
		
		Student studentArray[] = new Student[100];
		Student st = new Student();
		StudentController studentController = new StudentController(studentArray);
		View view = new View(studentController);
		
		// initialize the elements of the array
		studentController.initialize(studentArray);

		// dosyadaki veriler ile studentArray verilerini eþitlememiz lazým.
		studentArray = studentController.syncFileAndArray(st, studentArray); // esitledik ve bize text dosyasindaki
																				// bilgileri array olarak dondurdu

		 // st returned.
		//studentController.addStudent(studentArray, st); // st objesi hem diziye hem de txt dosyasina yazilacak.

		
		
		// Let's read the txt file and the studentArray if they are equal.
		 
		// Reads the text file
		// studentController.readFromFile(); studentController.readArray(studentArray);
		 
		
		//Reads the studentArray
		//studentController.readArray(studentArray);
		
		
		View.Menu(st, studentArray);
	}

	

}
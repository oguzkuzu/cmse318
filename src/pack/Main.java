package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pack.controller.StudentController;
import pack.model.Student;

public class Main {

	public static void main(String[] args) {

		Student studentArray[] = new Student[100];
		Student st = new Student();
		StudentController studentController = new StudentController(studentArray);

		// initialize the elements of the array
		studentController.initialize(studentArray);

		// dosyadaki veriler ile studentArray verilerini eþitlememiz lazým.
		studentArray = studentController.syncFileAndArray(st, studentArray); // esitledik ve bize text dosyasindaki
																				// bilgileri array olarak dondurdu

		st = studentController.scanInformationAndCreateTheStudentObject(st); // st returned.
		studentController.addStudent(studentArray, st); // st objesi hem diziye hem de txt dosyasina yazilacak.

		
		
		// Let's read the txt file and the studentArray if they are equal.
		 
		// Reads the text file
		// studentController.readFromFile(); studentController.readArray(studentArray);
		 
		
		//Reads the studentArray
		//studentController.readArray(studentArray);
	}

	// menu();
	public static void Menu(Student[] s) {

		System.out.println(" 0 Ogrenci no ile ara.  1 \n Ogrenci silmek icin 2 \n Arama yapmak icin 3 ");
		// scannerla oku
		// s[0].findByStudentId("17001836");

		// switch-case

		// case 1: þunu yap
		// case 2: bunu yap

		// default: tekrar menüyü göster

	}

}
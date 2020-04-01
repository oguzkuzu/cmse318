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
		studentController.syncFileAndArray(st, studentArray);

		st = studentController.scanInformationAndCreateTheStudentObject(st); // st returned.
		studentController.addStudent(studentArray, st); // st objesi hem diziye hem de txt dosyasina yazilacak.

		// Let's read the txt file and the studentArray
		studentController.readFromFile();
		studentController.readArray(studentArray);

	}

	// menu();
	public static void Menu(Student[] s) {

		System.out.println(" 0 Öðrenci Numarasý ile ara.  1 \n Öðrenci silmek icin 2 \n Arama yapmak icin 3 ");
		// scannerla oku
		// s[0].findByStudentId("17001836");

		// switch-case

		// case 1: þunu yap
		// case 2: bunu yap

		// default: tekrar menüyü göster

	}

	// write to console

	public static void printAll(Student[] s) {

		Student[] a = s;

		for (int i = 0; i < 100; i++) {

			System.out.print(a[i].getName());
			System.out.print(a[i].getLastName());
			System.out.println("");

		}

	}

}
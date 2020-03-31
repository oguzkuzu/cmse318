package pack;


public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub	

	Student studentArray[] = new Student[100];	

	studentArray = initStudents(studentArray);
	//printAll(studentArray);

	/*
	 studentArray[0].saveAndWriteToTheFile("17001836", "Ata", "Kuzu", 1994, "M", "MERSIN"); //method works fine! It wrote student.txt file
	studentArray[0].readFromFile();
	
	studentArray[1].saveAndWriteToTheFile("123", "Ata", "Kuzu", 1994, "M", "MERSIN"); //method works fine! It wrote student.txt file
	studentArray[1].readFromFile();
	
	studentArray[2].saveAndWriteToTheFile("445", "Ata", "123", 1234, "M", "123"); //method works fine! It wrote student.txt file
	studentArray[2].readFromFile(); 
	*/
	
	
	

	
	
	
}
	
	// menu();
	public static void Menu(Student[] s) {
		
		System.out.println(" 0 Öðrenci Numarasý ile ara.  1 \n Öðrenci silmek icin 2 \n Arama yapmak icin 3 ");
		//scannerla oku
		s[0].findByStudentId("17001836");
		
		
		//switch-case 
		
		// case 1: þunu yap
		// case 2: bunu yap
		
		//default: tekrar menüyü göster
		
		
		
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
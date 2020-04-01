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
import java.util.ArrayList;

public class StudentController {
	
	
	File f = new File("C:\\Users\\ABRA\\workspace\\Assignment_1/students.txt");
	public Student student = new Student();
	
	public StudentController(Student st) {
		
		this.student = st;
		
	}
	

	
	public void addStudent(String studentId, String name, String lastName, int birthYear, String sex,

			String countryOfBirth) {
		
	

		try { 
			
			//Listenin sonunu bul. Ordan itibaren kayýt yap.

			
			BufferedWriter writer = new BufferedWriter(new  OutputStreamWriter(new FileOutputStream(f,true)));

			
			
						
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
	
	
	public void addStudent(Student st) {

		System.out.println("you said " + st.getName());
		
		
		this.student.setstudentId(st.getstudentId());
		this.student.setName(st.getName());
		this.student.setLastName(st.getLastName());
		this.student.setBirthYear(st.getBirthYear());
		this.student.setSex(st.getSex());
		this.student.setCountryOfBirth(st.getCountryOfBirth());
		
		//addStudentToArray(st, st.getstudentId());
		
		try {
			
			//Listenin sonunu bul. Ordan itibaren kayýt yap.

			BufferedWriter writer = new BufferedWriter(new  OutputStreamWriter(new FileOutputStream(f,true)));

			
			// veri yazmaya baslamadan once writer.newLine() yap!!
			writer.newLine();
			
			writer.append(st.getstudentId()+ "          ");

			writer.append(st.getName()+ "          ");

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

		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));

			String s = reader.readLine();

			System.out.println("Student Data: \n " + s);
			
			
			while (s != null) {

				s = reader.readLine();
				
				if (s == null) {
					System.out.println(" \n End of the document");
				} else		
				
				System.out.println("\n " + s);

			}

			

			reader.close();
		

		} catch (Exception e) {

			// TODO: handle exception
			System.out.println("exception");

		}

	}
	
	
	
	// Maindeki students -> bir arraylist veya list. ama st tek bir students objesi.  
	public String findByStudentId(ArrayList<Student> students, String studentId) {
		System.out.println("FindByStudentId Starting.... \n");

		String result;
		if (students.contains(studentId)) {
			System.out.println("Yes there's someone in that ID");
		}
		else {
			System.out.println("There's no one in that ID");
		}
		
		
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));

			String s = reader.readLine();
			
			while(!s.contains(studentId)) {
				System.out.println(".");
			} 
			
			if (false){
				System.out.println("Yes there's someone");
			} else {
				System.out.println("no");
			}
			
			reader.close();
		
		} catch (Exception e) {

			// TODO: handle exception
			System.out.println("exception");

		}
			
		return "Search done!";
		
	}
	
	public String findContemporaryStudents (int birthYear) {
		
		// ayný yaþtakileri bul
		return null;
	}

	public void modifyStudentRecord(String studentId, String choice) {
		//studentId al + neyi editleyecekse onu al
		// switch case ile 
		/* case: "1" -> Id deðiþtir
		 * "2" -> ad deðiþtir.
		 * 
		 */
	}
	
	public void deleteStudentRecord(String studentId) {
		
		//delete by studentId
	}


	public void addStudentToArray(Student[] studentArray, String studentId) {
		int i = 0;
		System.out.println("Yeni array sistemine hoþ geldin");
		
		// 0000 olan ilk satýrý bulup oraya iþlem yaptýracaðýz.
		
		for(i=0; i < studentArray.length;i++) {
			if(studentArray[i].getstudentId() == studentId) {
				System.out.println("We find it its " + i + ". element");
			}
		}
	}
}

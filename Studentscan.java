package Student_assignment1;

import java.util.Scanner;

public class Studentscan {
	
	int database;
	int operatingsystem;
	int maths;
	int datascience;
	int totalmarks;
	int average;
	
	
	//Calculate the Subject Total Marks
	public void subjecttotal() {
		
		totalmarks=database+operatingsystem+maths+datascience;
		System.out.println("Total marks = "+totalmarks);
		
	}
	//Calculate the subject average
	public void subjectavg() {
		
		average=totalmarks/4;
		System.out.println("Average marks = "+average);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentscan student1= new Studentscan();
		Studentscan student2= new Studentscan();
		Studentscan student3= new Studentscan();
		Studentscan student4= new Studentscan();
		Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter Marks for student1");
		 student1.database= input.nextInt();
		 student1.operatingsystem= input.nextInt();
		 student1.maths= input.nextInt();
		 student1.datascience= input.nextInt();
		 student1.subjecttotal();
		 student1.subjectavg();
		 
		 
		 System.out.println("Enter Marks for student2");
		 student2.database= input.nextInt();
		 student2.operatingsystem= input.nextInt();
		 student2.maths= input.nextInt();
		 student2.datascience= input.nextInt();
		 student2.subjecttotal();
		 student2.subjectavg();
		 	 
		 
		 System.out.println("Enter Marks for student3");
		 student3.database= input.nextInt();
		 student3.operatingsystem= input.nextInt();
		 student3.maths= input.nextInt();
		 student3.datascience= input.nextInt();
		 student3.subjecttotal();
		 student3.subjectavg();
		 
		 
		 System.out.println("Enter Marks for student4");
		 student4.database= input.nextInt();
		 student4.operatingsystem= input.nextInt();
		 student4.maths= input.nextInt();
		 student4.datascience= input.nextInt();
		 student4.subjecttotal();
		 student4.subjectavg();

	}

}

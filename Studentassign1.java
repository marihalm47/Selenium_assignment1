package Student_assignment1;

public class Studentassign1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.name="Monika";
		student1.database=87;
		student1.operatingsystem=50;
		student1.maths=70;
		student1.datascience =90;
		
		Student student2 = new Student();
		student2.name="Tanisha";
		student2.database=60;
		student2.operatingsystem=57;
		student2.maths=75;
		student2.datascience =100;
		
		Student student3 = new Student();
		student3.name="Radhika";
		student3.database=50;
		student3.operatingsystem=70;
		student3.maths=55;
		student3.datascience =80;
		
		Student student4 = new Student();
		student4.name="Ramya";
		student4.database=66;
		student4.operatingsystem=82;
		student4.maths=65;
		student4.datascience =96;
		
		System.out.println("//...........Total Marks and Average of each student...................//");
		System.out.println("");
		//System.out.println("");
		
		System.out.println("//...........Student Monika...................//");
		System.out.println("Total Marks of Student Monika - "+student1.subjecttotal() );
		System.out.println("Average Marks of Student Monika - "+student1.subjectavg() );
		System.out.println("");
		
		System.out.println("//...........Student Tanisha...................//");
		System.out.println("Total Marks of Student Tanisha - "+student2.subjecttotal() );
		System.out.println("Average Marks of Student Tanisha - "+student2.subjectavg() );
		System.out.println("");
		
		System.out.println("//...........Student Radhika...................//");
		System.out.println("Total Marks of Student Radhika - "+student3.subjecttotal() );
		System.out.println("Average Marks of Student Radhika - "+student3.subjectavg() );
		System.out.println("");
		
		System.out.println("//...........Student Ramya...................//");
		System.out.println("Total Marks of Student Ramya - "+student4.subjecttotal() );
		System.out.println("Average Marks of Student Ramya - "+student4.subjectavg() );
		System.out.println("");
	}

}

class Student
{
	String name;
	//marks in 4 different subject
	int database;
	int operatingsystem;
	int maths;
	int datascience;

    int subjecttotal()
    {
       return database+operatingsystem+maths+datascience;
    }
    int subjectavg()
    {
       return (database+operatingsystem+maths+datascience)/4;
    }
}
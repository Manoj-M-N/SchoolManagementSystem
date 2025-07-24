package school.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {



		System.out.println("School MANAGEMENT SYSTEM");
		System.out.println("1.Student Section \t2.Teacher Section\t3.School Section\t4.Exit");
		int c;
		do {
			System.out.println("Enter your choice");
			c=s.nextInt();
			switch(c) {
			case 1:studentsDetails();
			break;
			case 2:teachersDetails();
			break;
			case 3:schoolDeatils();
			break;
			case 4:System.out.println("Exiting.......");
			System.exit(0);
			default:System.out.println("Please enter valid choice");
			}
		}while(c!=0);


	}

	private static void schoolDeatils() {

		System.out.println("The total money earned by the School:"+School.getTotalMoneyEarned());
	}

	public static void teachersDetails() {
		List<Teacher> teachersList=new ArrayList<>();
		System.out.print("How many teachers do you want to add? ");
		int n = s.nextInt();
		int a = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter ID, Name, and Salary for Teacher " + (i + 1));
			int id = s.nextInt();
			String name = s.next();
			int salary = s.nextInt();

			Teacher teacher = new Teacher(id, name, salary);
			teachersList.add(teacher);
			teacher.setSalary(salary);
			System.out.println("\n--- Teacher Details ---");
			System.out.println("ID: " + teacher.getID() + ", Name: " + teacher.getName() + ", Salary: " + teacher.getSalary());


		}
	}

	private static void studentsDetails() {
		System.out.print("How many students do you want to add? ");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter ID, Name, Grade and Fees paid of Student " + (i + 1));

			int id=s.nextInt();
			String name=s.next();
			int grade=s.nextInt();
			int fee=s.nextInt();			
			Student student=new Student(id,name,grade);
			Student.payFees(fee);
			System.out.println("\n--- Student Details ---");

			System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Grade: " + student.getGrade());
			System.out.println("Remining Fees paid by student "+student.getRemainingFees());

		}



	}

}

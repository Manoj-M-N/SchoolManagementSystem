package school.management.system;

import java.util.List;

public class School {

	
	private List<Teacher> teachers;
	private static List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	public School(List<Teacher> teacher,List<Student> student) {
		this.students=student;
		this.teachers=teacher;
		this.totalMoneyEarned=0;
		this.totalMoneySpent=0;
		
	}

	public List<Teacher> getTeacher() {
		return teachers;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public static List<Student> getStudent() {
		return students;
	}

	public static void setStudent(Student name) {
		students.add(name);
	}

	public static int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static int updatedTotalMoneyEarned(int MoneyEarned) {
		return totalMoneyEarned += MoneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public static int updateTotalMoneySpent(int moneySpent) {
		return totalMoneyEarned -= moneySpent;
	}
	
}

package school.management.system;

public class Student {

	private int id;
	private String name;
	private int grade;
	private static int feesPaid;
	private static int feesTotal;

	public Student(int id,String name,int grade) {

		this.feesPaid=0;
		this.feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;

	

	}


	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
	
	public static void payFees(int fees) {
		feesPaid+= fees;
		School.updatedTotalMoneyEarned(feesPaid);
	}

	public static int getRemainingFees() {
		return feesTotal-=feesPaid;
	}

	public String toString() {
		return "Name of the student is "+name
				+" he paid a fees of $"+feesPaid;
	}

}

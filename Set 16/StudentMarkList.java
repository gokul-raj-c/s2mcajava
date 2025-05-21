import java.util.Scanner;

interface Marksheet {
	void calculateTotal();
	void calculatePercentage();
	void displayResult();
}

class Student {
	int rollNo;
	String name;

	void inputStudentDetails(Scanner sc) {
    	System.out.print("Enter Roll Number: ");
    	rollNo = sc.nextInt();
    	sc.nextLine();  
    	System.out.print("Enter Name: ");
    	name = sc.nextLine();
	}
}

class Exam extends Student implements Marksheet {
	int mark1, mark2, mark3;
	int total;
	double percentage;

	void inputMarks(Scanner sc) {
    	System.out.print("English : ");
    	mark1 = sc.nextInt();
    	System.out.print("Maths : ");
    	mark2 = sc.nextInt();
    	System.out.print("Science : ");
    	mark3 = sc.nextInt();
	}

	public void calculateTotal() {
    	total = mark1 + mark2 + mark3;
	}

	public void calculatePercentage() {
    	percentage = total / 3.0;
	}

	public void displayResult() {
    	System.out.println("\n--- Student Marksheet ---");
    	System.out.println("Roll No: " + rollNo);
    	System.out.println("Name   : " + name);
    	System.out.println("Englsih  : " + mark1);
    	System.out.println("Maths  : " + mark2);
    	System.out.println("Science  : " + mark3);
    	System.out.println("Total  : " + total);
    	System.out.printf("Percentage: %.2f%%\n", percentage);
	}
}

public class StudentMarkList {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Exam student = new Exam();

    	student.inputStudentDetails(sc);
    	student.inputMarks(sc);

    	student.calculateTotal();
    	student.calculatePercentage();
    	student.displayResult();

    	sc.close();
	}
}

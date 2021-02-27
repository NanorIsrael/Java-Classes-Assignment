package Q1;

public class Student{
	String name;
	int roll_no;
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// creating object of the class Student
		Student student = new Student();
		student.name = "John";
		student.roll_no = 2;

		System.out.print("Student name: "+student.name +"\nstudent roll number :"+student.roll_no);
	}

}

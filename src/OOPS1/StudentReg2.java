package OOPS1;

public class StudentReg2 {
	
	String name;
	int age;
	static String school = "Rao's School";
	
	void Register() {
		System.out.println("Student Registered successfully");
	}
	
	void Delete() {
		System.out.println("Student Deleted successfully");
	}
	
	public static void main(String[] args) {
		
		StudentReg st1 = new StudentReg();
		StudentReg2 st2 = new StudentReg2();
		
		st1.name = "Venky";
		st1.age = 30;
		
		System.out.println(school);
		System.out.println(StudentReg2.school);
		System.out.println(StudentReg.school);
		
		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st2.name);
		System.out.println(st2.age);	
	}
}

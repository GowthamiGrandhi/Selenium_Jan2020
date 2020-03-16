package OOPS1;

public class StudentReg {
	
	String name;
	int age;
	static String school = "Narayana School";
	
	void Register() {
		System.out.println("student registered successfully");
	}
	
	void Delete() {
		System.out.println("student deleted successfully");
	}
	
	public static void main(String[] args) {
		
		StudentReg st1 = new StudentReg();
		StudentReg st2 = new StudentReg();
		//System.out.println(school); //class variable, static variable
		//System.out.println(st1.age); // for non static variable need to create an object or instance
		st1.name = "Suresh";
		st1.age = 15;
		st1.Register();
		
		st2.name = "Ramesh";
		st2.age = 13;
		st2.Register();
		System.out.println(st1.name);
		System.out.println(st1.age);
		
		System.out.println(school);
		System.out.println(StudentReg.school); // can use this to call a static variable in some other class
		System.out.println(st1.school); // no need to call the static variable by using instance
		System.out.println(st2.school); // if we call static variable by instance there is no difference i.e., no need
		
		st1.school = "Chaitany School";
		
		System.out.println(st2.name);
		System.out.println(st2.age);
		
		System.out.println(school);
		System.out.println(StudentReg.school);
		System.out.println(st1.school);
		System.out.println(st2.school);
	}

}

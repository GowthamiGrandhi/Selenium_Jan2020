package OOPS1;

public class StudentReg3 {
	
	static StudentReg3 obj;
	String name;
	int age;
	static String school = "Rao's School";
	
	void assign1() {
		name = "Suresh";
		age = 14;
	}
	
	static void assign2() {
		obj = new StudentReg3();
		obj.name = "Venky";
		obj.age = 16;
	}
	
	void display1() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(school);
	}
	
	static void display2() {
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(school);
	}
public static void main(String[] args) {
	
	assign2();
	display2();
	obj.assign1();
	obj.display1();
	
}
}



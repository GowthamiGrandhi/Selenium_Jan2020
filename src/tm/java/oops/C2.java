package tm.java.oops;

public class C2 extends C1 {
	
	void add(int x, int y) {
		System.out.println("Add of int, int in C2 class: " +(x+y));
	}
	
	void add(double x, double y) {
		System.out.println("Add of double, double in C2 class: " +(x+y));
	}
	
	void mul(int x, int y) {
		System.out.println("Mul of int, int in C2 class: " +(x*y));
	}
	
	public static void main(String[] args) {
		
		C2 obj1 = new C2();
		obj1.add(30, 60); // overriding - it will call C2 method though C1(parent) has same method
		obj1.add(10, 30.5);//overloading  
	}

}

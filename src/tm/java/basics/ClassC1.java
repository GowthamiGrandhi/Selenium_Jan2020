package tm.java.basics;

public class ClassC1 {
	void m1() {
		System.out.println("M1 method in C1 Class");
	}
	public static void main(String[] args) {
		ClassC1 obj1 = new ClassC1();
		obj1.m1();
		
		c2 obj2 = new c2();
		obj2.m2();
		
		c3 obj3 = new c3();
		obj3.m3();
	}
}
//==================================================================
class c2 {
void m2() {
	System.out.println("M2 method in C2 Class");
}
}
//==================================================================
class c3 {
	void m3() {
		System.out.println("M3 method in C3 Class");
	}
}

package tm.java.oops;

public class C1 {

	void add(int x, int y) {
		System.out.println("Add of int, int in C1 class: " +(x+y));
	}
	
	void add(int x, double y) {
		System.out.println("Add of int, double in C1 class: " +(x+y));
	}
	
	void add(int x, int y, int z) {
		System.out.println("Add of int, int, int in C1 class: " +(x+y+z));
	}
	
	void sub(int x, int y) {
		System.out.println("Sub of int, int in C1 class: " +(x-y));
	}
	
	public static void main(String[] args) {
		
		C1 obj1 = new C1();
		obj1.add(10, 20);
		obj1.add(20, 30, 40);
	}
}

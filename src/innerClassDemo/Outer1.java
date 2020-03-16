package innerClassDemo;

public class Outer1 {
	//static nested class inner class example
	static void m1() {
		System.out.println("m1 method executed");
	}
	static class nested {
		static void m2() {
			System.out.println("m2 method executed");
		}
		public static void main(String[] args) {
			m1();
			m2();
		}
	}

}

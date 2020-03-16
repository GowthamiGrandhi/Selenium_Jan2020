package innerClassDemo;

public class MainClass {
public static void main(String[] args) {
		
	/*
	 * nested inner lass	
	outer obj1 = new outer();
		obj1.m1();
		//outer.inner obj2 = new outer().new inner();
		outer.inner obj2 = obj1.new inner();
		obj2.m2();
		*/
	//method local inner class
	
	outer obj = new outer();
	obj.m1();
	}
}
//===========================================================================================
//nested inner class	
/*class outer {
		class inner {
		void m2() {
			System.out.println("Inner class method");
		}
	}
		void m1() {
			System.out.println("Outer class method");
		}
}
*/
//===========================================================================================
// method local inner class method in method is possible	
class outer {
	void m1() {
		class inner {
			void m2() {
		System.out.println(" Inner class Method");
	}
}
		inner obj1 = new inner();
		obj1.m2();
	}
}
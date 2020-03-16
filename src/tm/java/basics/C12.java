package tm.java.basics;

import OOPS1.C10;

public class C12 extends C10 {
	
	public static void main(String[] args) {
		C10 obj1 = new C10();
		obj1.m4();
		// obj1.m3(); // can't access protected outside
		
		C12 obj2 = new C12();
		obj2.m3(); // can access protected through derived class from other package
		obj2.m4();
	}

}

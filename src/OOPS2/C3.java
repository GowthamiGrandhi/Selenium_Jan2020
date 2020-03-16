package OOPS2;

public class C3 extends C2 {
	  public void mul() {
		
	}
	public static void main(String[] args) {
		C3 obj1 = new C3();
		C1 obj2 = new C3();
		C2 obj3 = new C3();
		//obj1 methods
		obj1.add();
		obj1.sub();
		obj1.mul();
		//obj3 methods
		obj3.add();
		obj3.sub();
		obj3.mul();
		//obj2 methods
		obj2.add();
	}
}


package OOPS2;

public class SciCalc extends Calc {
	
	SciCalc() {
		System.out.println("Child Class SciCalc Constructor executed");
	}

	public static void main(String[] args) {
		SciCalc obj1 = new SciCalc();
		obj1.add();
		obj1.sub();
	}
}

package OOPS2;

public class Calculator {
	
	int x;
	int y;
	
	Calculator() {
		this.x = 20;
		this.y = 10;
	}
	
	void add() {
		System.out.println("Add: "+(x+y));
	}
	
	void sub() {
		System.out.println("Sub: "+(x-y));
	}
	public static void main(String[] args) {
		Calculator obj1 = new Calculator();
		obj1.add();
		obj1.sub();
	}

}

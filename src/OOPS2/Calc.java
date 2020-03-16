package OOPS2;

public class Calc {
	
	int x;
	int y;
	
	Calc() {
		this.x = 20;
		this.y = 10;
		System.out.println("Calc Constructor is executed");
	}
	
	Calc(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void add() {
		System.out.println("Add: "+(x+y));
	}
	
	void sub() {
		System.out.println("Sub: "+(x-y));
	}
	public static void main(String[] args) {
		Calc obj1 = new Calc();
		obj1.add();
		obj1.sub();
		
		Calc obj2 = new Calc(100,50);
		obj2.add();
		obj2.sub();
		
	}

}

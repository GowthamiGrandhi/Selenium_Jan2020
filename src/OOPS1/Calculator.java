package OOPS1;

public class Calculator {
	
	int x;
	int y;
	
	void add(){
		
		System.out.println("Addition: " +(x+y));
	}

	void sub(){
		
		System.out.println("Subtraction: " +(x-y));
	}

	void mul(){
	
	System.out.println("Multiplication: " +(x*y));
	}
	void div(){
		System.out.println("Division: " +(y/x));
	}
	public static void main(String[] args) {
		
		Calculator cals1 = new Calculator();
		cals1.x = 20;
		cals1.y = 200;
		cals1.add();
		cals1.mul();
		cals1.div();
	
		Calculator cals2 = new Calculator();
		cals2.x = 100;
		//y value is default value, integer default value is '0'
		//cals2.y = 50;
		cals2.add();
		
	}
}

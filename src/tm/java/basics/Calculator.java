package tm.java.basics;

public class Calculator {
	
	public void add (int x, int y)
	{
		
		int z;
		z = x + y;
		System.out.println("Addition is: " + z);
	}
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.add(20,30);
	
	}
}

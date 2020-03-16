package OOPS1;

public class Arithmetic {

	void add(int x, int y) { // method definition
		int z = x+y;
		System.out.println("Add: " +z);
	}
	int mul(int x, int y) {
		int z = x*y;
		//System.out.println("Mul: " +z);
		return z;
	}
	
	public static void main(String[] args) {
		
		Arithmetic obj1 = new Arithmetic();
		obj1.add(20, 30);
		int z = obj1.mul(30, 5);
		System.out.println("Ret value is:" +z);
	} 
}

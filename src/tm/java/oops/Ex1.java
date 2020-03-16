package tm.java.oops;

public class Ex1 {
	
	public void add(int x, int y) {
		System.out.println("Add int, int from Ex1 is: " +(x+y));
	}
	
	static void add(int x, int y, int z) {
		System.out.println("Add int, int from Ex1 is: " +(x+y+z));
	}
	
	private void mul(int x, int y) {
		System.out.println("Mul int, int from Ex1 is: " +(x*y));
	}
	
public static void main(String[] args) {
		
		Ex1 obj = new Ex1();
		obj.mul(10,5);
		
	}

}

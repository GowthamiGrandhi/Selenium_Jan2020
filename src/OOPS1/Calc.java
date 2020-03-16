package OOPS1;

public class Calc {
	int x;
	int y;
	int z;// class variable
	
	void add(){
		int z; //local variable to this method
		z= x+y;
		System.out.println("output of z is: " +z);
		System.out.println("output of z is: " +this.z); //this keyword is used here to call class variable (z), becoz this method has local variable with same name as class variable
				
	}
	void sub(){
		z = x-y;
		System.out.println("output of z is: " +z);
	}
	public static void main(String[] args) {
		Calc obj1 = new Calc();
		obj1.x = 10;
		obj1.y = 20;
		obj1.add();
		
		obj1.sub();
		
		obj1.x = 400;
		obj1.y = 500;
		obj1.add();
		
		
	}

}

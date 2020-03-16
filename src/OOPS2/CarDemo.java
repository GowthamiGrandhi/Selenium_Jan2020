package OOPS2;

public class CarDemo {

	public static void main(String[] args) {
		//Car obj1 = new Car(); // we can't instantiate interface
		//CarMaruthi800 obj2 = new CarMaruthi800(); // we can't instantiate abstract class
		
		MarutiBreeza obj3 = new MarutiBreeza();
		Car obj4 = new MarutiBreeza();
		CarMaruthi800 obj5 = new MarutiBreeza();
		
		//obj3 methods
		obj3.airbags();
		obj3.audio();
		obj3.doorlock();
		obj3.engine();
		obj3.gears();
		obj3.windows();
		
		//obj4 methods
		obj4.airbags();
		obj4.gears();
		obj4.engine();
		obj4.gears();
		obj4.windows();
		
		//obj5 methods
		obj5.airbags();
		obj5.audio();
		obj5.doorlock();
		obj5.engine();
		obj5.gears();
		obj5.windows();
		
			
	}

}

package tm.java.oops;

public class AadharManipulate {
	
	void create() {
		
		System.out.println("User Created successfully");
		}
	void edit() {
		
	}
	void delete() {
		
	}
	public static void main(String[] args) {
		
		Aadhar cust1 = new Aadhar();
		cust1.setName("Venky");
		cust1.setAge(31);
		cust1.setAddress("Pragathi Nagar");
		
		String nam = cust1.getName();
		int ag = cust1.getAge();
		String ad = cust1.getAddress();
		
		System.out.println(nam);
		System.out.println(ag);
		System.out.println(ad);
		
		AadharManipulate am = new AadharManipulate();
		am.create();
	}

}

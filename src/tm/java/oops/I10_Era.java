package tm.java.oops;

public class I10_Era {
	
	void body() {
		System.out.println("Body method executed");
	}
	
	void engine() {
		System.out.println("engine method executed");
	}
	
	private void manualwindows() {
		System.out.println("manual method windows executed");
	}
	
	void gears() {
		System.out.println("gears method executed");
	}
	
	public static void main(String[] args) {
		I10_Era obj = new I10_Era();
		obj.manualwindows();
	}

}

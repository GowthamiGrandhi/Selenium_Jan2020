package tm.java.oops;

public class I10_Magna extends I10_Era {
	
	void powerwindiws() {
		System.out.println("powerwindows method executed");
	}
	void automirroradjust() {
		System.out.println("automirroradjust method executed");
	}
	
	public static void main(String[] args) {
		I10_Era era = new I10_Era();
		era.body();
		I10_Magna magna = new I10_Magna();
		magna.body();
	}

}

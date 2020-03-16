package StringDemo;

public class Ex2 {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("Testing");
		s1.append(" Masters");
		System.out.println(s1); // o/p is Testing Masters
		
		String s2 = "Testing";
		s2.concat(" Masters");
		System.out.println(s2); // o/p is Testing
		
	}

}

package StringDemo;

public class CharAt {

	public static void main(String[] args) {
		
		String s = "selenium";
		//To get single character with given index
		//System.out.println(s.charAt(5));
		
		// How to print each character from a string
		for(int i = 0; i<s.length(); i++) {
			System.out.print(s.charAt(i));
		}

	}

}

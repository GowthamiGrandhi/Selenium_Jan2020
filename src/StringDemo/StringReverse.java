package StringDemo;

public class StringReverse {

	public static void main(String[] args) {
		
		String s = "Gowthami Venky";
		int n = s.length()-1;
		String str = "";
		for(int i=n; i>=0; i--) {
			str = str + s.charAt(i);
		}
		System.out.println(str);

	}

}

package StringDemo;

public class Ex1 {

	public static void main(String[] args) {
	/*	
		String str = "Testing Masters";
		int n = str.length();
		System.out.println("Length is: " +n);
	*/
	/*
		String s1 = "Testing Masters Technologies";
		if(s1.contains("s T"))
			System.out.println("exist");
		else
			System.out.println("not exist");
	*/
	/*	
		String s1 = " Testing Masters ";
		System.out.println(s1.length());
		System.out.println(s1.trim().length());
		String s2 = s1.trim();
		System.out.println(s2);
		System.out.println(s2.length());
	*/
	/*	
		String s1 = "testing masters";
		System.out.println(s1.toUpperCase());
	*/
	/*
		String s1 = "TESTING MASTERS";
		System.out.println(s1.toLowerCase());
	*/
	/*	
		String s1 = "Testing Masters";
		System.out.println(s1.toLowerCase());
	*/
	/*
		//String s1 = "Testing Masters";
		//System.out.println(s1.equalsIgnoreCase("testing masters"));
		//System.out.println(s1.equals("Testing Master"));// we can compare objects along with plain text
		//System.out.println(s1.contentEquals("testing masters")); // compare plain text
		String s1 = "Sunny";
		String s2 = "Bunny";
		System.out.println(s1.equalsIgnoreCase("s2"));
		System.out.println(s1.equals("s2"));
		System.out.println(s1.contentEquals("s2"));
	*/
	/*
		String s1 = "Testing Mastets";
		//String[] arr = s1.split("e");
		String[] arr = s1.split(" ");
		//System.out.println(arr[0]);
		for (String s : arr)
			System.out.println(s);
	*/
	/*	
		String s1 = "Testing Masters";
		System.out.println(s1.substring(8)); // o/p : Masters
		System.out.println(s1.substring(5, 15)); // o/p ng Masters
	*/	
	
	/*	
	    String s1 = "Testing Masters";
		//System.out.println(s1.startsWith("Testing"));
		//System.out.println(s1.endsWith("ters"));
		//System.out.println(s1.startsWith("ing"));
		System.out.println(s1.endsWith("Mas"));
	*/
	/*	
		String s1 = "Testing Masters Technologies";
		//String s2 = s1.replace("T", "t");
		String s2 = s1.replace("Testing", "QA");
		//String s2 = s1.replace(" ", "");
		System.out.println(s2);
	*/
		String s1 = "Testing";
		//System.out.println(s1.concat("Masters"));
		String s2 = s1.concat(" Masters");
		System.out.println(s1);
		System.out.println(s2);
	}
		
}

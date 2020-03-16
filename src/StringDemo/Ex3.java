package StringDemo;

public class Ex3 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Testing");
		
		long n1 = System.currentTimeMillis();
		for(int i=1; i<=100; i++)
			sb1.append("Masters");
		
		System.out.println("StringBuffer time taken : " +(System.currentTimeMillis()-n1));
		//System.out.println("StringBuffer output: ");
		//System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Testing");
		
		long n2 = System.currentTimeMillis();
		for(int i=1; i<=100; i++)
			sb2.append("Masters");
		
		System.out.println("StringBuffer time taken : " +(System.currentTimeMillis()-n2));
		//System.out.println("StringBuilder output: ");
		//System.out.println(sb2);
	}

}

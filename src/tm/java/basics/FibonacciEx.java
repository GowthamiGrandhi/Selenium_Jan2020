package tm.java.basics;

public class FibonacciEx {
	public static void main(String[] args) {
		
	int num = 10;
	int n1 = 0;
	int n2 = 1;
	int sum = 0;
	for(int i=0; i<num; i++) {
		
		sum = n1+n2;
		n1 = n2;
		n2 = sum;
		System.out.print(n1+ " ");
	}
  }
}	
		
	
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter Number");
//			int n = sc.nextInt();
//			
//		int f0 = 0;
//		int f1 = 1;
//		int f3;
//		int f2;
//		System.out.print(f0);
//		System.out.println(f1);
//		for (int i = 2; i <=n; i++) {
//			
//			f3 = f0+f1;
//			System.out.println(f3);
//			f0 = f1;
//			f2 = f3;
//						
//		}
				
		

	



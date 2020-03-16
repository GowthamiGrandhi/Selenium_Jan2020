package ArraysDemo;

public class Arrays_Exercise1 {

	public static void main(String[] args) {
		
		int[] A = {10, 20, 30, 40};
		int[] B = new int[4];
		
		for(int i=0; i<A.length; i++)
			B[i] = A[i];
		
		for(int i=0; i<B.length; i++)
			System.out.println(B[i]);

	}

}

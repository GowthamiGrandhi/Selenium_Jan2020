package ExceptionHandling;

public class Ex1 {
	static void div(int den) {
		try {
		double d = 50/den;
		System.out.println("Result: " +d);
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
			//e.getMessage(); - //doesn't display message if u don't give it in syso
			//e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		//div(10);
		int[] arr = {2,4,5,0,10,25};
		for(int i=0; i<arr.length; i++) {
			div(arr[i]);
		}
		
	}

}

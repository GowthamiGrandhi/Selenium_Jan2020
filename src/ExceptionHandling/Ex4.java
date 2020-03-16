package ExceptionHandling;

public class Ex4 {

	public static void main(String[] args) {
		
		try {
			int a =15;
			int b = 0;
			if(b ==0) {
				throw new ArithmeticException("Cannot divide by zero");
				}
			else {
				int c = a/b;
				System.out.println("Output is: " +c);
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Cannot divide by zero");
			//e.printStackTrace();
		}
	}

}

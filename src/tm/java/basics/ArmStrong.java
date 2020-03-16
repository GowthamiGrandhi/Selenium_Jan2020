package tm.java.basics;

public class ArmStrong {

	public static void main(String[] args) {
		
		int num = 153;
		int n, sum = 0, temp;
		temp = num;
		
		while(num != 0) {
			n = num%10;
			sum = sum + (n*n*n);
			num = num/10;
		}
		if (temp == sum) {
			System.out.println("Given number is armstrong number: " +sum);		
		}
		else {
			System.out.println("Given number is not armstrong number: " +sum);
		}
		
	}
}

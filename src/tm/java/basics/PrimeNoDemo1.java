package tm.java.basics;

public class PrimeNoDemo1 {

	public static void main(String[] args) {
		
		
		for (int n=2; n<=50; n++){
			int cnt = 0; //local variable to main method
			for (int i=2; i<=n/2; i++){
				if(n % i == 0){
					cnt++;
				}
			}
			if(cnt==0)
				System.out.print(n +" ");
		}
	}
}

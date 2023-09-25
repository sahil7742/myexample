package sahil;
//import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
		/*System.out.println("enter number");
		Scanner input = new Scanner (System.in);
		
		int n = input.nextInt();
		for (int i= 2; i<n; i++) {
			int a = (n%i);
			
			if (a==0) {
				System.out.println("not prime");
				break;
			}else {
				System.out.println("prime");
				break;
				
			}
		
		}*/
		
		int n = 25;
		int temp;
		boolean isprime = true;
		for (int i = 2; i <= n / 2; i++) {
			temp = n % i;
			if (temp == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");

	}
}


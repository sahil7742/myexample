package sahil;

import java.util.Scanner;

public class primefactor {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//for factor of input
		for (int i = 3; i <=n; i++) {
			System.out.println("loop" +i);
			// for prime no.
			while (n % i == 0) {
				n = n / i;
				if (n != 1) {
					System.out.println(n);
				}
			}

		}
	}
}
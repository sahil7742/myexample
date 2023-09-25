package sahil;

public class PALINDROME {

	public static void main(String[] args) {
		int sum = 0;
		int c= 4658;
		int x=0;

		int n = 4658;
		while (n != 0) {
			x++;
			int d = n % 10;
			sum = sum*10 + d;
			System.out.println("step" +x);
			System.out.println(sum);
			n=n/10;
			System.out.println(n);

		}if (sum==c) {
			System.out.println("pl no."+ n +sum);
		}else {
			System.out.println(n);
			
		}

	}

}

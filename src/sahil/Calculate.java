package sahil;

public class Calculate {
	public boolean isprime(int n) {
		int temp;
		boolean isprime = true;
		for (int i = 2; i <= n / 2; i++) {
			temp = n % i;
			if (temp == 0) {
				isprime = false;
				break;
			}
		}
		return isprime;

	}

	public boolean isprime(double dec) {
		int n = (int) dec;
		int temp;
		boolean isprime = true;
		for (int i = 2; i <= n / 2; i++) {
			temp = n % i;
			if (temp == 0) {
				isprime = false;
				break;
			}
		}
		return isprime;

	}
}

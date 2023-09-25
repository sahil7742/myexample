package sahil;

public class modulo {

	public static void main(String[] args) {
		/*
		 * int i = 12; if (i % 2 == 0) { System.out.println("value is even"); } else {
		 * System.out.println("odd"); }
		 */
/////////////////////////////////////////////////////////////////////////////////////
		// sum of digits
		int sum = 0;
		int n = 78;
		int i = 0;
		while (n != 0) {//// 
			int d = n % 10;
			n = n / 10;
			sum = sum + d;

			}System.out.println( "sum of digit " +sum);
	}
}

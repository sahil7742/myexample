package sahil;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		//System.out.println("enter number");
		//Scanner input = new Scanner (System.in);
		//int m = input.nextInt();
		//double n = input.nextDouble();
		Calculate prime = new Calculate(); ///calss ko bulaya gaya
		if (prime.isprime(8)) { ////yhe class ko shikaya gya tha
			System.out.println("number paass is prime");
		} else {
			System.out.println("not prime");
		}

	}

}

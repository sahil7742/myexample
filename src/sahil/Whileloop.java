package sahil;
import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		/*for (int i = 1; i<=10; i++) {
			
		}*/
		// when we use same veriable inside or outside loop then there will be no error
		System.out.println("enter number");
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		String x;
		int i =2;
      while (i<=n) {
    	  x = (n%i==0)? "notprime":"prime";
    	  i++;
    	  System.out.println(x);
    	  break;
      }
	}

}

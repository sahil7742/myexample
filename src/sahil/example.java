package sahil;
import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		/*//1
		int x= 5 , y = 5 ;
		if (x<=y) {
		System.out.println("true");
		}
		else {
		System.out.println("false");
		}
		
		//2for all true only true(&&)
		boolean t = true;
		boolean d = true;
		if (t && d) {
			System.out.println("condition is true");
		}
		else {
			System.out.println("condition is false");
		}
		
		//3 for all false only false
		
		boolean a = false;
		boolean b = false;
		if (a || b) {
			System.out.println("condition is true");
		}
		else {
			System.out.println("condition is false");
		}
		
		// 4for integer
	    int w = 5;
		int s = 10;
		if ((w<s) && (w==s)){
			System.out.println("condition is true");
		}
		else {
			System.out.println("condition is false");
		}
		
		//5 for integer
		 int p = 5;
			int o = 10;
			if (!(p<o) || (p==o)){
				System.out.println("condition is true");
			}
			else {
				System.out.println("condition is false");
			}
			*/
			Scanner input = new Scanner(System.in);
			System.out.println("enter ageof boy");
			System.out.println("enter ageof girl");
			int ageofboy = input.nextInt();
			int ageofgirl = input.nextInt();
			
	if ( (ageofboy>21 )|| (ageofgirl>18)) {
	System.out.println("age is legal for CHUDAYI");
	}
	else{
		System.out.println("not egligible for chudai");
		
	}
			
			
	}

}

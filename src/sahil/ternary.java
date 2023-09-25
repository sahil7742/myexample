package sahil;
//import java.io.*;
//import java.util.Scanner;
public class ternary {
     // use instead of if else
	public static void main(String[] args) {
		/*System.out.println("enter marks");
		Scanner input = new Scanner (System.in);
		int marks= input.nextInt();
		String result = (marks>40) ? "pass":"fail";
		
		//int  max , n1=2; int n2 = 4; ;
		//max = (n1 > n2)? n1:n2;
		System.out.println( result+ marks);*/
		
		
		
		int n1 = 2, n2 = 5, n3 = -9;
	
		int largest = (n1>=n2)? ((n1 >= n3)? n1:n3): ((n2 >= n3)? n2 : n3);
		System.out.println("largest" + largest);
		
		
		

	}

}

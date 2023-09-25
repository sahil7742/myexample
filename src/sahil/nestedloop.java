package sahil;

public class nestedloop {

	public static void main(String[] args) {
		/*for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {

				System.out.println("value of i and j " + i + " " + j);
			}
			System.out.println("_________________________________________________");
		}*/

		
		
		
		/*for (int j=1; j<=5; j++) {
			for (int i=1; i<=j; i++) {
			System.out.print(" * ");
		}
			System.out.println(" | ");
		}*/
		int rows =4;
		int column = 5;
		// outer loop
		for(int i = 1;i<= rows; i++) {
			
			//inner loop
			for (int j = 1; j<=column; j++) {
				System.out.print((i +"-" + j +" "));
			}
			System.out.println();
			
		}
	}
	

}

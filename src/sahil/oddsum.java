package sahil;

public class oddsum {

	public static void main(String[] args) {
		
		int sum= 0, c=0;//counter is maachdua thing
		for (int i=1; i<=50;i++) {
			if(i%2==0) {
			c++;
			System.out.println("The"+c +"no is"+i);
			if(c==10)
			{
				break;
			}
			}
		}

	}

}

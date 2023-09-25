package sahil;

public class Methods {

	public static void main(String[] args) {
		/*System.out.println("area of reactangle with length = 5.4" + "and width 3.2: "+arearectangle(5.4,3.2) );
		
		//double area = arearectangle(5.4,3.2);
		//System.out.println(area);

	}
	public static double arearectangle(double length, double width) {
		return length*width;*/	
		
		
		////////////////////////////////////////////////////////////method overloading//////////////////////////////////////////////////////////////////
		//here cpu auto identify the data and calculate in method
		System.out.println("area of rectangle:=" + area(19.69, 69.89));
		System.out.println("area of square:=" + area(6.87d));
		System.out.println("area of square:=" + area(44.25d));
		System.out.println("area of square:=" + area(6));
		System.out.println("area of square:=" + area(5));
		System.out.println("sum of int and float" + sum(5, 2.98f));
		System.out.println("sum of integer" + sum(5, 2));

	}

	public static double area(double length, double width) {
		return length * width;
	}

	public static double area(double side) {
		return side * side;
	}

	public static int area(int side) {
		return side * side;

	}

	public static int sum(int x, int y) {
		System.out.println("add 2 int entities");
		return x + y;
	}

	public static float sum(int x, float y) {
		System.out.println("add 1 int entities and 1 float");
		return x + y;
	}

}

package basic_programs;

public class Conditional_Operators {

	public static void main(String[] args) {
		// To check the given values Equal or not
		int a=10, b=10;
		if (a==b) {
			System.out.println("Given two values are Equal and the value is :: "+a+ "  "+b);
		}
		
		// To Check weather the numbers are even or not
		
		if (a%2==0 ) {
			System.out.println("The value is Even:: "+a);
		}
		else {
			System.out.println("The value is odd:: "+a);
		}
	}

}

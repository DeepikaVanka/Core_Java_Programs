package basic_programs;

public class Looping_Conditions {

	public static void main(String[] args) {
		// Using While loop
		// Printing all the even numbers between 20
		int i =0;
		while(i<=20) {
			System.out.println("The value of i is :: "+i);
			i+=2;	
		}
		// Using do-While loop
		// Printing all the odd numbers between 20
		System.out.println("--------------------------------------------------------");
		int j=1;
		do {
			System.out.println("The Value of i is :: "+j);
			j+=2;
		}
		while(j<=20);{

		}
		
		// Using for loop
		// Print all the numbers divisible by 5
		for (int k=1;k<=50;k++) {
			if (k%5==0) {
				System.out.println("The Divisible Values is :: "+k);		
			}
		}
		
		//Printing 2 table using for loop
		for (int d=1;d<=20;d++) {
			System.out.println("2"+"*"+d+"="+2*d);
		}
	}
}




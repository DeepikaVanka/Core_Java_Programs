package oops;
//Execution program for method overloading

//The process of developing multiple methods with same name but different argument list is called as Method Overloading.
/*Rules : 
 * Between Argument list number of arguments shown be different
 * Between the argument list type of arguments should be different
 * Between the argument list sequence (or) position should be different*/

public class Method_Overloading {
	
	public static void run() {
		System.out.println("Optum Global technologies, Hyderabad");
	}
	public static void run(int i) {
		System.out.println("In int run Method :: " +i);
	}
	
	public static void run(String s) {
		System.out.println("In String run Method :: " +s);
	}
	public static void run(int i, String s) {
		System.out.println("In integer:: " +i + " and " +s+ "  string run method");
	}

	public static void main(String[] args) {
		// Calling functions inside the main method
		run();
		run(10);
		run(5,"Deepa");
		run("Deepu");

	}

}

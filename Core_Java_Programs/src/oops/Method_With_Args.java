package oops;

public class Method_With_Args {

	public static void main(String[] args) {
		// Example for the Method with Arguments for executing integer value
		run(100);
		execute("java");
	}
	public static void execute(String S) {
		// Example for the Method with Arguments for executing string value
		System.out.println("The String Execute is :: "+S);	
	}
	public static void run(int i) {
		System.out.println("In Integer run is :: "+ i);
	}

}

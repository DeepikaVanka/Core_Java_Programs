package basic_programs;

public class Static_Variables {

	static int i=100;

	public static void main(String[] args) {
		// Accessing static variable in a Non_Static Method

		Static_Variables SV= new Static_Variables();
		SV.run();
	}
	public void run() {
		System.out.println(i);
	}

}

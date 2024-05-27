package basic_programs;

public class Non_Static_Variables {
	int i=100;

	public static void main(String[] args) {
		// Non Static Variables in a Non Static Method

		Non_Static_Variables nsv= new Non_Static_Variables();
		nsv.run();
	}
	public void run() {
		System.out.println(i);
	}

}

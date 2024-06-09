package oops;
public class Constructor_Chaining1 {
	public Constructor_Chaining1() {
		super();
		System.out.println("Statement for the constructor chaining");
	}
}
class Deepika
{
	public static void main(String[] args) {
		Constructor_Chaining1 CC = new Constructor_Chaining1();
	}
}	
class world{
	public world() {
		System.out.println("World statement");
	}
}



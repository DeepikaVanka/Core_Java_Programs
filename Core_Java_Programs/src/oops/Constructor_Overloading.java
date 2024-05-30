package oops;

public class Constructor_Overloading {

	public static void main(String[] args) {

		Constructor_Overloading a=new Constructor_Overloading();
		Constructor_Overloading b=new Constructor_Overloading(100);
		Constructor_Overloading c=new Constructor_Overloading(10, 752.5);
		Constructor_Overloading d=new Constructor_Overloading(85.25);
	}
	public Constructor_Overloading() {
		System.out.println("The First Step");
	}
	public Constructor_Overloading(int i) {
		System.out.println("The integer is the Second Step");
	}
	public Constructor_Overloading(double d) {
		System.out.println("The Double is the third Step");
	}
	public Constructor_Overloading(int i , double d) {
		System.out.println("The integer and double values are the fourth step");
	}
}
/*
 * Developing Multiple Constructors with same name but different Argument List is called as constructor Overloading
Between the Argument list number of Arguments should be different 
Between the Argument list type of Arguments should be different
Between the Argument list Position should be different*/
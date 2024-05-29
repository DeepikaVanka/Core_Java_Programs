package oops;

public class Sample_Constructor {
	public static void main(String args[]) {
		Sample_Constructor Sc= new Sample_Constructor();
	}

	public Sample_Constructor() {
		System.out.println("In Sample Example Constructor");
	}
}

/*Constructor is a special type of method which gets executed each time when ever object gets created
The main purpose of a constructor is to initialize Non_Static Variable

Rules for defining a constructor:
1. Constructor does not allows non-access modifiers like static,non-static, final or abstract
2. Constructor allows access specifiers like public, private, protected and default
3. Constructor does not allows return type
4. The name of the constructor must be same as that of class name
5. A constructor can be with argument or without argument
6. Constructor is neither static nor non-static

Constructors are two types
1. Default Constructor 2.Parameterized Constructor
*/

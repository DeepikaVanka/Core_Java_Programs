package oops;
/* The process of calling one constructor from another constructor is called as the constructor chaining
 * Constructor chaining can be achieved in two ways
 * 1. call to this-> this() 
 * 2. call to super-> super()
 */
/*Call to this-> this(): The process of calling one constructor from another
  constructor of same class is called as call to this.
 */ 
public class Constructor_Chaining {
	public static void main(String[] args) {
		// Sample program for call to this-> this()
		Constructor_Chaining cc=new Constructor_Chaining();
	}
	public Constructor_Chaining() {
		this(100);
		System.out.println("Sample constructor definition");
	}
	public Constructor_Chaining(int i) {
		this(545.545);
		System.out.println("The Interger constructor");
	}
	public Constructor_Chaining(double d) {
		this(100, 147.225);
		System.out.println("The Double value constructor");
	}
	public Constructor_Chaining(int i, double d) {
		System.out.println("The integer and double constructor");
	}

}

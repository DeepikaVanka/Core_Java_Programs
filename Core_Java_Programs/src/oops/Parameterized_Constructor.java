package oops;

public class Parameterized_Constructor {
	String flowername;
	String color;
	public Parameterized_Constructor(String fname, String fcolor) {
		flowername=fname;
		color=fcolor;
	}

	public static void main(String[] args) {	
		Parameterized_Constructor Pc= new Parameterized_Constructor("Rose", "Red");	
		Pc.display();
		Parameterized_Constructor Pc1= new Parameterized_Constructor("Lotus", "Pink");	
		Pc1.display();	
	}
	public void display() {
		System.out.println("The Name of the Flower :: "+flowername);
		System.out.println("The Color of the Flower :: "+color);

	}

}
/*If a constructor has one or more than one argument it is called as parameterized constructor*/
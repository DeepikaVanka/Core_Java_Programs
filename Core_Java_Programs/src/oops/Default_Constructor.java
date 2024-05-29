package oops;

public class Default_Constructor {
	String flowername;

	public static void main(String[] args) {
		Default_Constructor dc= new Default_Constructor();
		System.out.println(dc.flowername);
	}
	public Default_Constructor() {
		flowername= "rose";
	}

}
/* If a constructor does not have any argument that is called as default constructor*/
package march1;

public class LogicalOperators {

	public static void main(String[] args) {
	    int a=200,b=300,c=200;
	   	System.out.println(a==c && c==a);//true
	   	System.out.println(a==c && c==b);//false
	   	System.out.println(a==c || a==b);//true
	   	System.out.println(a==b || b<a);//false
	   	System.out.println(!(a!=b));//false
	   	System.out.println(!(a==b));//true

	}

}

package march4;
public class ArrayExample {
	public static void main(String[] args) {
		int x[] =new int[6];
		x[0]= 10;
		x[1]= 20;
		x[2]= 30;
		x[3]= 40;
		x[4]= 50;
		x[5]= 60;
		//Printing length of the Array
		System.out.println(x.length);
		//Print Specific value from Array
		System.out.println(x[2]);
		System.out.println("==============");
		for (int each : x) {
			System.out.println(each);	
		}
		System.out.println("==============");
		for (int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	} 
}



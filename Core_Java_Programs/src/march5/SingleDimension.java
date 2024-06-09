package march5;

public class SingleDimension {

	public static void main(String[] args) {
		Object x[] = new Object[5];
		x[0]= "Deepika";
		x[1]= 100;
		x[2]= 524.15;
		x[3]= 'D';
		x[4]= true;
		System.out.println(x.length);
		for (Object each: x) {
			System.out.println(each);
		}
	}
}

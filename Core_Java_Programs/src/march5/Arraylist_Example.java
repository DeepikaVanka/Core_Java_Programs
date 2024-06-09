package march5;

import java.util.ArrayList;

public class Arraylist_Example {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Deepika");
		list.add("Surya");
		list.add("Naga Alekhya");
		list.add("jansi");
		list.add("Ramesh");
		list.add("Ramakrishna");
		list.add("Alekhya");
		//print the size of the list
		System.out.println(list.size());
		for (int i=0; i<=3; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("======================");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

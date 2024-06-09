package march2;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Marks");
		for(int i=1;i<=10;i++) {
			int marks= sc.nextInt();
			if (marks>=35) {
				System.out.println("Pass:: "+marks);
			}
			else {
				System.out.println("Fail:: "+marks);
			} 
		}

	}
}

package march4;

import java.util.Scanner;

public class SwitchCaseExecution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Course");
		for (int i=1;i<=10;i++) {
			String course=sc.next();
			switch (course.toUpperCase()) {
			case "JAVA": {
				System.out.println("Java course Available");
				break;
			}
			case "AWS": {
				System.out.println("Java course Available");
				break;
			}
			case "PYTHON": {
				System.out.println("Java course Available");
				break;
			}
			case "SQL": {
				System.out.println("Java course Available");
				break;
			}
			default:
				System.out.println("No Course Found");
				break;
			}
		}

	}

}

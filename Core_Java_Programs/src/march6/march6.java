package march6;

public class march6 {

	public static void main(String[] args) {
		// Finding length of the string
		String str = "My name is deepika";
		System.out.println(str.length());
		System.out.println("--------------------------");
		// Finding Equals of the two strings
		String firststr= "Deepika";
		String Secondstr= "Deepika";
		String Thirdstr= "deepika";
		System.out.println(firststr.equals(Thirdstr));//false
		System.out.println(firststr.equals(Secondstr));//true
		System.out.println("--------------------------");

		// Finding Equalsignore of the strings
		System.out.println(firststr.equalsIgnoreCase(Thirdstr));//true
		System.out.println(firststr.equalsIgnoreCase(Secondstr));//true
		System.out.println(Secondstr.equalsIgnoreCase(Thirdstr));//true
		System.out.println("--------------------------");

		// Finding contains of the strings
		String statement = "I am very good girl from my childhood";
		System.out.println(statement.contains("good"));
		System.out.println(statement.contains(" "));
		System.out.println("--------------------------");

		// Finding concat of the strings
		String firstname= "Deepika";
		String lastname ="Vanka";
		System.out.println(firstname.concat(lastname));
		System.out.println("--------------------------");

		// Finding startswith of the strings
		System.out.println(firstname.startsWith("Dee"));//true
		System.out.println(firstname.startsWith("abc"));//false
		System.out.println("--------------------------");

		// Finding endswith of the strings
		System.out.println(firstname.endsWith("a"));//true
		System.out.println(firstname.endsWith("u"));//false
		System.out.println("--------------------------");

		// Finding CharAt of the strings
		//Reverse of the string
		for(int i=statement.length()-1;i>=0;i--)
		{
			System.out.print(statement.charAt(i));
		}
		System.out.println();
		System.out.println("--------------------------");
		//Non reverse of the string
		for(int i=0;i<statement.length();i++)
		{
			System.out.print(statement.charAt(i));
		}
		System.out.println();
		System.out.println("--------------------------");

		//Reverse of the string using string buffer
		String Word ="doohdlihc ym morf lrig doog yrev ma I";
		StringBuffer x= new StringBuffer(Word);
		System.out.println(x.reverse());
		System.out.println("--------------------------");
	}

}

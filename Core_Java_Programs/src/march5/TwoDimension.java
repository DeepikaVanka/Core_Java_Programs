package march5;
//Only Acceptable for homogeneous data
public class TwoDimension {
	/*user1 pass1
	user2 pass2
	user3 pass3
	user4 pass4
	user5 pass5*/
	public static void main(String[] args) {
		//Store Login data into two dimension
		String str [][] = new String[5][2];// five rows and two cells
		str[0][0]="user1";
		str[0][1]="pass1";
		str[1][0]="user2";
		str[1][1]="pass2";
		str[2][0]="user3";
		str[2][1]="pass3";
		str[3][0]="user4";
		str[3][1]="pass4";
		str[4][0]="user5";
		str[4][1]="pass5";
		//print the length of the Rows
		System.out.println(str.length);
		//print the length of the column for any one row
		System.out.println(str[0].length);
		//print the specific cell data
		System.out.println(str[4][1]);
		//Looping statement for Rows
		for (int i=0;i<str.length;i++) {
			for (int j=0;j<str[i].length;j++) {
				//printing all the data from rows and cells
				System.out.print("\t"+str[i][j]);
			}
			System.out.print("\n");
		}
	}

}

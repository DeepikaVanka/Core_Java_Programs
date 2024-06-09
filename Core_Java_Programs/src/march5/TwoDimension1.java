package march5;
//Program for heterogeneous data
public class TwoDimension1 {
	public static void main(String[] args) {
		Object str[][]= new Object[5][2];
		str[0][0]="user1";
		str[0][1]=12345;
		str[1][0]="user2";
		str[1][1]=45678;
		str[2][0]="user3";
		str[2][1]=96325;
		str[3][0]="user4";
		str[3][1]=85214;
		str[4][0]="user5";
		str[4][1]=85412;
		//print length of the rows
		System.out.println(str.length);
		//Print length of the cells for any one row
		System.out.println(str[0].length);
		//Printing specific value of the cell
		System.out.println(str[2][1]);
		//Looping for the cells and rows
		System.out.println("========================");
		for (int i=0;i<str.length;i++) {
			for (int j=0;j<str[i].length;j++) {
				System.out.print(str[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

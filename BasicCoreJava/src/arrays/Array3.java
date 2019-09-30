package arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String[][] str= new String[4][2];
		
		//Row 1
		str[0][0]="Username";
		str[0][1]="Password";
		//Row 2
		str[1][0]="U1";
		str[1][1]="P1";
		
		str[2][0]="U2";
		str[2][1]="P2";
		
		str[3][0]="U3";
		str[3][1]="P3";
				
				//System.out.println(str[1][1]);
		for(int r=0; r<4; r++)
		{
			for(int c=0; c<2; c++)
			{
			System.out.print(str[r][c]+" ");	
			}
			System.out.println();
		}
	}
	

}

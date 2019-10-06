package ArreyPractice;

public class TwoDimentialArrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] data = new String[5][2];
		
		data[0][0] = "Username";
		data[0][1] = "Password";
		
		data[1][0] = "Username";
		data[1][1] = "Password";
		
		data[2][0] = "Username";
		data[2][1] = "Password";
		
		data[3][0] = "Username";
		data[3][1] = "Password";
		
		data[4][0] = "Username";
		data[4][1] = "Password";
		
		
		
		/*for(int i=0; i<=4; i++)
			{
			for(int j=0; j<=1; j++)
			{	
			System.out.println(data[i][j].length());
			}
		System.out.println();*/
		
		for(int i=0; i<data.length; i++)
		{
		for(int j=0; j<data[i].length; j++)
		{	
		System.out.println(data[i][j]);
		}
	System.out.println();
		
		}

}
}
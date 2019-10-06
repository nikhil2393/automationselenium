package ArreyPractice;

public class Arrey1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String [7];
		
		str[0] = "garnesh";
		str[2] = "ramesh";
		str[3] = "juned";
		str[4] = "yugmesh";
		str[5] = "theory";
		str[6] = "paltan";
		
	/*for (int i=0; i<=6; i++)
	{
		System.out.println(str[i]);
		}*/
		
		for(String s:str)
		{
			System.out.println(s);
		}
	}
}

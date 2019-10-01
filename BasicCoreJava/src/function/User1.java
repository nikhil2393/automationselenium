package function;

public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ciaz=new Car();
		
		ciaz.wheels=4;
		ciaz.color="silver";				
		ciaz.type="Hatchback";	
		ciaz.accelaration();
		
		Car Car2 =new Car();
		//Car2.wheels=5;
		//Car2.color="black";
		//Car2.type="Sedan";
		Car2.accelaration();
		
		Car Car3= new Car();
		System.out.println(ciaz.color);
		System.out.println(Car2.color);
		System.out.println(Car3.color);
		
		System.out.println(ciaz.wheels);
		System.out.println(Car2.wheels);
		System.out.println(Car3.wheels);
	}

}

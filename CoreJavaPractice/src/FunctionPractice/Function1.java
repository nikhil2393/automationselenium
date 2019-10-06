package FunctionPractice;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubismc
		int a=Sum (10,20);
		int b=Sum (20,50);
		System.out.println(a+b);

		NonStaticFunction obj= new NonStaticFunction();
		System.out.println(obj.sum(10, 20));
	}
	public static int Sum(int a, int b)
	{
		//int a=20;
		//int b=30;
		//int sum=a+b;
		
		//System.out.println(sum);
	int sum=a+b;
	return sum;
	}
}

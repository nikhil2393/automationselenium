package FunctionPractice;

public class NonStaticFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stubat
		NonStaticFunction obj= new NonStaticFunction();
		int add=obj.sum(10,20);
		System.out.println(add);
		
		Function1.Sum(10, 20)

	}
	public int sum(int a, int b)
	{
		return a+b;
	}
	
}

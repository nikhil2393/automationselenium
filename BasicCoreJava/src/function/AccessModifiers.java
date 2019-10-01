package function;

public class AccessModifiers {
	
	public static void main(String[] args)
	{
		AccessModifiers obj=new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.noAccessModFunction();
		obj.protectedFunction();
	}

	public void publicFunction()
	{
		System.out.println("public function");
	}
	
	private void privateFunction()
	{
		System.out.println("private function");
	}
	
	void noAccessModFunction()
	{
		System.out.println("No Access Mod. function");
	}
	protected void protectedFunction() {
		System.out.println("procted function");
	}
}

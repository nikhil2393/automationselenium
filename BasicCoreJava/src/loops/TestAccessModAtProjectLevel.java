package loops;

import function.AccessModifiers;//taken from hover section

//import function.AccessModifiers;

public class TestAccessModAtProjectLevel extends AccessModifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj=new AccessModifiers();
		obj.publicFunction();
		//obj.no  
		//obj.pro
		TestAccessModAtProjectLevel obj2 = new TestAccessModAtProjectLevel();
		obj2.protectedFunction();
		
		
	}

}

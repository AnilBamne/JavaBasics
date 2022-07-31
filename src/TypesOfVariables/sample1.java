package TypesOfVariables;

public class sample1
{

	int c=300;     //  global variable
	
	public void m1()
	{
		int a=10;       // local variable
		System.out.println(a);    //10 
		System.out.println(c);     //30
	}
	
	
	public void m2()
	{
		int b=200;     //local variable
		System.out.println(b);       // 20
		//System.out.println(a);
		System.out.println(c);       //30
	}
	
	

	
}

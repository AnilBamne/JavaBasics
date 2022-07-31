package Exceptionhandling;

public class example1 
{

	public static void main(String[] args) 
	{
	
		int a=10;
		int b=0;
		int c=0;
		
		try
		{
			c=a/b;    // 10/0  ---> risky code
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception handeled");
			
		}
		
		System.out.println(c);
		
		System.out.println("next further codes");
	}
}

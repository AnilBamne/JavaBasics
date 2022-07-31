package Exceptionhandling;

public class example3 
{
	public static void main(String[] args) 
	{
		String s1 = "may be im doing practice";
		
		try
		{
			System.out.println(s1.charAt(2));
		}
		
		catch(StringIndexOutOfBoundsException rohan)
		{
			System.out.println("Exception handled");
		}
		
		System.out.println("Next codes");
		
		
	}

}

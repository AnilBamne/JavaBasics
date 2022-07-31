package Exceptionhandling;

public class example5 
{
	
	public static void main(String[] args)
	{
		
		String [] ar =new String[4];   //0-3
				
		try
		{
			ar[8]="abc";     //risky code
		}
		catch(ArithmeticException rohan) 
		{
			System.out.println("Arithmetic Exception handled");
		}
		catch(StringIndexOutOfBoundsException rohan) 
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException sunil) 
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}	
		catch(Exception punam)
		{
			System.out.println("generic Exception handled");
			punam.printStackTrace();
		}
		
				
		System.out.println("Gm");
		
		
	}



}

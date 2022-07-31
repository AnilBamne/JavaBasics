package Exceptionhandling;

public class example2 

{

	public static void main(String[] args) 
	{
		
		String [] array = new String[4];
		
		try
		{
			array[2]="abc";
		}
		
		catch(ArrayIndexOutOfBoundsException neha)
		
		{
			System.out.println("Array Index Out Of Bounds Exception Handled");
		}
		
		System.out.println("Next codes");
	}
	
}

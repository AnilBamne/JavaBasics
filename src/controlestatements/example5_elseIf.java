package controlestatements;

public class example5_elseIf
{

	public static void main(String[] args)
	{
		
		int marks = 0;
		
		// 60>=65
		if(marks>=65)             //condition1
		{
			System.out.println("Distinction");
		}
		//      60>=60
		else if (marks>=60)      //condition2
		{
			System.out.println("1st class");
		}
		//60>=50
		else if (marks>=50)             //condition3
		{
			System.out.println("2nd class");
		}
		//60>=35
		else if (marks>=35)          //condition4
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		
		
		
		
		
	}

	
}

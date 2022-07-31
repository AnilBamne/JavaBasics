package controlestatements;

public class Nested_If 
{

	public static void main(String[] args)
	{
			
		int age = 15;
		int weight =55;
		
		//15>=18
		if(age>=18)           //outer if
		{
			System.out.println("age>=18");
			
			//45>=50
			if(weight>=50)           //inner if or nested if
			{
				System.out.println("Eligible for blood donation: weight>=50");
			}
			else
			{
				System.out.println("Not eligible for blood donation: weight<50");
			}		
			
		}
		else 
		{
			System.out.println("Not eligible for blood donation: age<18");
		}
	
		
	}

}

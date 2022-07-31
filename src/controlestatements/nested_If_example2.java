package controlestatements;

public class nested_If_example2 
{
	public static void main(String[] args)
	{
			
		
		int amount = 6000;
		
		
		//  6000>=500
		if (amount>=500)
		{
			System.out.println("no delevery charges");
			
			//6000 >= 5000
			if(amount>=5000) 
			{
				System.out.println("additional 10 % discount");
			}
			else
			{
				System.out.println("No discount");
			}
						
		} 
		else 
		{
			System.out.println("delevery charges: 50");
		}
		
		
		
		
	}

	
}

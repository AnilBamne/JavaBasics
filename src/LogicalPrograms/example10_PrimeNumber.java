
package LogicalPrograms;

public class example10_PrimeNumber 
{
	public static void main(String[] args)
	 {

		int n=6;
		int count= 0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
			 
			
				count++;
				break;
				
			}
		}
	
		if(count==1)
		{
			System.out.println("numner "+n+" is not prime");
		}
		else
		{
			System.out.println("numner "+n+" is  prime");
		}
		 
		
		
		
		
		
		
		
		
		
		
		
	 }
}
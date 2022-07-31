package StarPatterns;

public class pattern12 
{
	public static void main(String[] args)
	{
		//  *
		// ***
		//*****
				
		int space=2;
		int star=1;
		
		//           4<=3
		for(int i=1; i<=3; i++)
		{  
			//           1<=0
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
		           //    1<=5
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			space--;     //-1
			star=star+2;	 //7	
		}
		
		 
		
	}


}

package StarPatterns;

public class pattern9 
{
	public static void main(String[] args)
	{
		//  *
		// **
		//***
		
		
		int space=2;
		int star=1;
		
		//           4<=3
		for(int i=1; i<=3; i++)
		{  //            1<=0
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			//           4<=3
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			space--;    //0
			star++;		//3	
		}
		
	}


}

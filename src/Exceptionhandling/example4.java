package Exceptionhandling;

public class example4
{
	
	public static void main(String[] args) {
		
		String [] ar =new String[4];   //0-3
				
		try
		{
			ar[8]="abc";     //risky code
		}
		catch(Exception punam)
		{
			System.out.println("generic Exception handled");
			punam.printStackTrace();
		}
		
				
		System.out.println("Gm");
		
		
	}


}

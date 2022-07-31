package Array;

public class example7_StringArray_declarationInitializationInSingleStep
{

	public static void main(String[] args)
	{
		
		String [] ar= {"mahesh","ramesh","ganesh","suresh"};
	
		System.out.println(ar.length);  //4
		System.out.println(ar[1]);    //ramesh
		
		
		System.out.println("---print all data----");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}

	
}

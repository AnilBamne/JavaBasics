package String_class;

public class demo6 
{

	public static void main(String[] args)
	{
		String s1="my name is rahul";
		String s2="my name is anil";
				
		String [] ar=s1.split(" ");   // {my(0)    name(1)     is(2)     rahul(3)} 
		
		System.out.println(ar[1]);    //name
	
		
		System.out.println("print all data from string array---");
		for(int j=0; j<=ar.length-1; j++)
		{
			System.out.println(ar[j]);
		}
		
		System.out.println("-------------------------------");
		System.out.println("print all data in reverse");
		
		String [] array=s2.split(" ");
		
		System.out.println(array.length);
		
		for(int i=array.length-1; i>=0; i--)
		{
			System.out.println(array[i]);
		}
		
		 
	}


	
}

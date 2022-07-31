package String_class;

public class demo 
{
	
	public static void main(String[] args) 
	{
		
		String s2="my name is anil";
		
		String [] array=s2.split(" ");
		
		System.out.println(array.length);
		
		for(int i=array.length-1; i>=0; i--)
		{
			System.out.println(array[i]);
		}
	}
}

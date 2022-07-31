package String_class;

public class demo7_print_Para_In_ReverseOrder 
{
	public static void main(String[] args) 
	{
		
	
		String s1="my name is rahul";
	
		String [] ar=s1.split(" ");  // {my(0)    name(1)     is(2)     rahul(3)} 
	
			
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
		}
	
	}
}

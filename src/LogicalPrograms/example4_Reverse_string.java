package LogicalPrograms;

public class example4_Reverse_string 
{
	
	public static void main(String[] args) 
	{
		
		String Original="anil";
		String Reverse="";
		
		for(int i=Original.length()-1;i>=0;i--)
		{
			Reverse=Reverse+Original.charAt(i);
		}
		
		
		System.out.println(Original);
		System.out.println(Reverse);
		
		
	}

}

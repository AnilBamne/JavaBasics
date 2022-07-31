package LogicalPrograms;

public class example9_find_total_no_of_white_spaces_in_String 
{
	public static void main(String[] args) 
	{

		String s= "anil p b from wadi";
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char s1 = s.charAt(i);
			if(s1==' ')
			{
				count++;
			}
		}
		
		System.out.println("No. of spaces : "+count);
	}

}

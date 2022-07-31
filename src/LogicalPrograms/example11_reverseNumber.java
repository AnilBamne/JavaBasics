package LogicalPrograms;

public class example11_reverseNumber
{
	public static void main(String[] args)
	{
		
		int orgNum = 112233;
		String org = Integer.toString(orgNum);  //convert number to string

		String rev = "";
		for (int i = org.length() - 1; i >= 0; i--) 
		{
			rev = rev + org.charAt(i);
		}
		
		int revNum = Integer.parseInt(rev);   // convert string to number
		System.out.println(revNum);

		
		
	}

}

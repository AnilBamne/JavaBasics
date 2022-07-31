package LogicalPrograms;

public class example13_ReverseEachWordInStatement2 
{
	public static void main(String[] args)
	{
		
		String s="my name is rahul";
		
		String [] ar=s.split(" ");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			
			String org = ar[i];
			String rev="";
			
			for(int j=org.length()-1;j>=0;j++)
			{
				rev=rev+org.charAt(j);
			}
			
			System.out.println(rev+" ");

		}
				
		
			}

}

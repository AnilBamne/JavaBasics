package LogicalPrograms;

public class example13_printStatementInReverseOrder4 
{
	public static void main(String[] args) 
	{
		String s="my name is anil";
		
		String []ar=s.split(" ");
		
//		for(int i=0;i<ar.length;i++)
//		{
//			System.out.println(ar[i]);
//			
//		}
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
	}

}

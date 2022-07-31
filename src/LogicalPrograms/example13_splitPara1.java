package LogicalPrograms;

public class example13_splitPara1 
{
	public static void main(String[] args) 
	{
		
		String s="my name is abc";
		
		String [] ar = s.split(" ");
		
		System.out.println(ar[2]);
		
		System.out.println("------------");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
	}

}

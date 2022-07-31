package LogicalPrograms;

public class example7_evennumbers_from_1to100 
{
	public static void main(String[] args)
	{
		int num=0;
		for(int i=0;i<100;i++)
		{
			//System.out.println(num=num+1);
			num=num+1;
			if(num%2==0)
			{
				System.out.println("even num is : "+num);
			}
			else
	
			//System.out.println("---------------------");
			//if(num%2!=0)
			{
				System.out.println("odd num is  :"+ num);
			}
		}
		
	}

}

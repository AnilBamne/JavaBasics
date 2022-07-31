package LogicalPrograms;

public class example8_armstrongNumFrom1to1000
{
	public static void main(String[] args)
	{
		int num;
		int sum=0;
		
		for(int i=0;i<=1000;i++)
		{
			num=i;
			while(num>0)
			{
				int rem=num%10;
				sum=sum+(rem*rem*rem);
				num=num/10;
			}
		
			if(sum == i)
			{
				System.out.println(i+" ");
			}
			sum=0;
	    }
	}

}

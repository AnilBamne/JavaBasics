package LogicalPrograms;

import java.util.Scanner;

public class example8_factorial
{
	public static void main(String[] args) 
	{
		System.out.println("enter num:");
		Scanner scan=new Scanner(System.in);

		int num = scan.nextInt();    //3*2*1	 
		int fact = 1;     //6

		 
		for(int i =num; i>=1; i--)
		{
			fact = fact*i;      
		}
		

		System.out.println(fact);

		
	}

}

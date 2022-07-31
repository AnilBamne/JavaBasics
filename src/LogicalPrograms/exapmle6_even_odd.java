package LogicalPrograms;

import java.util.Scanner;

public class exapmle6_even_odd
{
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		
		//to find even or odd
		
		 
		if(num%2==0)
		{
			System.out.println("this number is even number");
			
		}
		else
			
		{
			System.out.println("this number is odd number");
		}
		
		 
	}

}

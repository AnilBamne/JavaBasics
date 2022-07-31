package LogicalPrograms;

import java.util.Scanner;

public class example8_Imp_Armtrong_Number
{
	public static void main(String[] args)
	{
		 Scanner scan =new Scanner(System.in);
		 System.out.println("enter a number");
		 int num=scan.nextInt();
		 int sum=0;
		 
		 for(int i=num; i>0; i=i/10)
		 {
			 int rem = i%10;
			 sum=sum+(rem*rem*rem);
		 }
		 System.out.println(num+"="+sum);
		 
		 if(sum==num)
		 {
			 System.out.println("this ia an armstrong number");
		 }
		 else
		 {
			 System.out.println("not an armstrong number");
		 }
				 
	}

}

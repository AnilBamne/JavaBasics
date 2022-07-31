package LogicalPrograms;

public class example12_Imp_Reverse_Number_without_String_Function 
{
	public static void main(String[] args) 
	{
		
		

		int num = 1234;  
		int revNum = 0;     //4321
//		
//			// 1234   0>0      1234/10=123/10=12/10=1/10=0
//		for(int i=num; i>0;   i= i/10) 
//		{
//			int rem = i % 10;      //  1%10= 1	
//			revNum = revNum * 10 + rem;      //4320 + 1 = 4321
//		}
//		
//			
//		System.out.println(revNum);

	
		
		
		
		
		while (num > 0)
		{
			int rem = num % 10;     
			
			revNum = revNum * 10 + rem;    
			
			num = num / 10;     
		}
		System.out.println(revNum);

	}

		
	

}

package Methods;

public class sample9
{

	//6. method with parameter
	
		public static void main(String[] args)
		{		
			addition(10,20);  //30
			addition(5, 6);   //11
			System.out.println("----------");
			
			sample9 s9=new sample9();
			s9.multiplication(7, 8);
			s9.multiplication(4, 3);	
			
			System.out.println("-----------------------");
			sample10.substraction(15, 3);
			sample10.substraction(5, 9);
			
			System.out.println("-------");
			sample10 s10=new sample10();
			s10.division(10f, 3f);
			s10.division(15f, 2.3f);
		}
		
		
		 
		//method with 2 int(int , int) parameter
		public static void addition(int num1, int num2)  //5, 6
		{
			int sum =num1+num2;          //11
			System.out.println(sum);
		}
		
		
		
		
		public void multiplication(int a, int b) //4, 3
		{
			int mul=a*b;      //12
			System.out.println(mul);
		}
		

		
		

	
}

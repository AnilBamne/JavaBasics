package TypesOfVariables;

public class sample5 
{

	//example of non-static global variable
	
		int c=30;    //non-static global variable from same class
		
		
		public static void main(String[] args)
		{
			
			//1. non-static variable call from same class
			sample5 s5=new sample5();  //A. create object of same class
			System.out.println(s5.c);  //B. objectName.variable
			
			System.out.println("-------------------");
			
			//2. non-static variable call from diff class
			sample6 s7=new sample6(); //A. create object of diff class
			System.out.println(s7.d);  //B. objectName.variable
					
		}
		
		
		
		public static void m3()
		{
			sample5 s6=new sample5();
			System.out.println(s6.c);
		}
		
		public void m4() 
		{
			System.out.println(c);
		}
		


	
}

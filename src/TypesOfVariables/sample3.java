package TypesOfVariables;

public class sample3 
{

	//example of static global variable
	
		static int a=10;      //static global variable
		

			
		public static void main(String[] args)
		{
			//1. static global variable call from same class
			System.out.println(a);     //variableName
			
			
			//1. static global variable call from diff class
			System.out.println(sample4.b);   //classname.variable
						
		}
		
		
		public static void m1() 
		{
			System.out.println(a);
		}
		
		public void m2()
		{
			System.out.println(a);
		}

	
	
}

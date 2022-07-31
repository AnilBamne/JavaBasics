package constructor;

public class sample3 
{

	//example2: User defined constructor
	
	
		//1. variable declaration   --> globally
		int num1;    //10
		int num2;    //20
		
		//2. initialization
		//user defined constructor  --> provided by user
		//use1: to initialize global variable
		//use2: to copy all the members of class into
		sample3()      //without/zero parameter 
		{
			num1 = 10;
			num2 = 20;
		}
			
		//3.Usage
		public void addition()
		{
			System.out.println(num1+num2);
		}
		
		public void multiplication()
		{
			System.out.println(num1*num2);
		}
		
		
		public static void main(String[] args)
		{
			
			sample3 s3=new sample3();
			s3.addition();    //30
			s3.multiplication();  // 200
			
			System.out.println("-------");
			
			sample4 s4=new sample4();
			s4.substraction();
			
			
			
			
		}
		
		

	
}

package Acces_specifires;

public class sample1 
{

	
	//1. example of private access specifiers
	
		private	int a;
		
		sample1()
		{
			a=20;
		}
		
		private void m1() 
		{
			System.out.println(a);
		}
		
		
		
		public static void main(String[] args)
		{		
			sample1 s1=new sample1();
			s1.m1();
			System.out.println(s1.a);
			
		}
		
		
		


	
}

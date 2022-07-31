package Acces_specifires;

public class sample15 
{

	//example of default access specifier
	
		int a;     //default access specifier
		
		 sample15()   //default access specifier
		{
			a=10;		
		}
		 
		 
		 void m2()   //default access specifier
		 {
			System.out.println(a);
		 }
		 
		 
		 public static void main(String[] args) 
		 {		
			 sample15 s15=new sample15();
			 s15.m2();
			 System.out.println(s15.a);	 
		}

	
}

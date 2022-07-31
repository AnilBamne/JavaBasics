package Inheritance;

public class HirarchicleInheritance 
{

	public static void main(String[] args) 
	{
		
		System.out.println("--properties of son1--");
		
		son1 s1=new son1();
		s1.mobile();
		s1.car();
		s1.money();
		s1.home();
				
		System.out.println("--properties of son2--");		
		son2 s2=new son2();
		s2.bike();
		s2.car();
		s2.money();
		s2.home();
		
		System.out.println("--properties of son3--");	
		son3 s3=new son3();
		s3.laptop();
		s3.car();
		s3.money();
		s3.home();	
		
	}


	
	
}

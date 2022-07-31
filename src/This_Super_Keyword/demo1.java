package This_Super_Keyword;

public class demo1 extends demo2
{

	//int a=30;  // global variable from super class
	
	
		int a=20;             //global variable from same/current class
		
		public void m1() 
		{
			int a=10;             //local variable
			System.out.println(a);	      //10
			System.out.println(this.a);   //20     //use to access global variable from same class
			System.out.println(super.a);   //30    //use to access global variable from super class
		}
		
		
		public static void main(String[] args)
		{		
			demo1 d1=new demo1();
			d1.m1();		
		}

	
	
}

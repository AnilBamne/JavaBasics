package constructor;

public class sample5 
{

	 int num3;   //100
	 int num4;   //200
	 
	 //user defined constructor with parameter(int, int )(2 int parameter)
	 //use1: to initialize global variable
	 //use2: copy all the members of class into object
	 sample5(int c, int d)   //100 ,200
	 {
		 num3 = c;    //100
		 num4 = d;	  //200 
	 }
	
		
	public void addition() 
	{
		System.out.println(num3+num4);
	}
	
	public void multiplication() 
	{
		System.out.println(num3*num4);
	}
	
	
	public static void main(String[] args)
	{		
		sample5 s5=new sample5(20, 30);
		s5.addition();
		s5.multiplication();
		System.out.println("----");
		
		sample5 s6=new sample5(5, 6);
		s6.addition();
		s6.multiplication();
		
		System.out.println("-----");
		
		sample5 s7=new sample5(100, 200);
		s7.addition();
		s7.multiplication();
		
		
	}

	
}

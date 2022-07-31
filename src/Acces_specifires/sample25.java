package Acces_specifires;

public class sample25 
{

	
	// Public access specifires
	public	int d;
	
	public sample25()
	{
		d=5;
	}
	
	public void m4()
	{
		System.out.println(d);
	}
	
	
	public static void main(String[] args) 
	{
		sample25 s25=new sample25();
		s25.m4();
		System.out.println(s25.d);	
	}


	
	
}

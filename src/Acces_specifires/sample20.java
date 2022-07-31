package Acces_specifires;

public class sample20 {


	// example of Protected access specifires
	
	
	protected	int c;


	protected  sample20()
	{
		c=30;
	}


	protected void m3() 
	{
		System.out.println(c);
	}




public static void main(String[] args) {
	
	sample20 s20=new sample20();
	s20.m3();
	System.out.println(s20.c);
	
	
}

	
}

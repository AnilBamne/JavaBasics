package constructor;

public class sample4
{


	int num3;  //25
	int num4;   //15
	
	
	//user defined constructor  --> provided by user
	//use1: to initialize global variable
	//use2: to copy all the members of class into
	sample4()           //   without/zero parameter constructor
	{
		num3=25;
		num4=15;		
	}
	
	
	
	public void substraction()
	{
		System.out.println(num3-num4);
	}
	

	
}

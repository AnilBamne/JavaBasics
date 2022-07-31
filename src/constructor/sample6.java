package constructor;

public class sample6 
{

	
	
int num3;
int num4;

//user defined constructor with parameter(int, int)(2 int)
//use1: to initialize global variable
//use2: to store all data into object
 sample6(int a, int b) 
 {
	 num3=a;
	 num4=b;
 }
 
 	 
 public void substraction() 
 {
	System.out.println(num3-num4);
 }

}
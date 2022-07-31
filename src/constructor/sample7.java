package constructor;

public class sample7 
{


	// example4: multiple constructor  --> constructor overloading
	
	
	int num1;
	int num2;
	String name;    //Nitin
	
	//user defined string parameter constructor
	sample7(String s1)    //Nitin
	{
		name=s1;   //Nitin
	}
	
	
	//user defined without parameter constructor
    sample7()
	{
    	num1=20;
    	num2=5;  	
	}
    
    //user defined with int,int parameter constructor
    sample7(int a, int b)  
    {
    	num1=a;
        num2=b;
    }
    
    
    public void studentName()
    {
    	System.out.println(name);
    }
       
   
    public void addition() 
    {
		System.out.println(num1+num2);
	}

    
    
    public static void main(String[] args)
    {
		sample7 s7=new sample7();
		s7.addition();     //25
		
		System.out.println("---");
		
	   sample7 s8=new sample7(5, 6);
	   s8.addition();       //11
	   
	   System.out.println("---");
	   
	   sample7 s9=new sample7("Nitin");
		s9.studentName();
		
	}

	
}

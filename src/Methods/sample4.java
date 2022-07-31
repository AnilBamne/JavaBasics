package Methods;

public class sample4
{

	
	//3. non-static regular method call from same class
	
		public static void main(String[] args)
		{
			
			// classname objectname=new classname();   --> syntax of object creation
			//objectname.methodname();               --> method call
			
			sample4	s4=new sample4();       //1. create object of same class
			s4.m5();                        //2. method call -> objectname.methodname();
			s4.m6();
			s4.m6();
			
			
			//1. samp1e4  --> classname --> datatype or objectType
			//2. s4  -> objectname   -> use To identify object
			//3. new   --> keyword  --> use to create blank/empty object
			//4. sample4()  --> classname() -->constructor --> use to copy/load all the members of class into object
			     
		}
		
		
		
		//non-static regular method
		public void m5() 
		{
			System.out.println("running non-static regular method: m5");
		}
		
		//non-static regular method
		public void m6() 
		{
			System.out.println("running non-static regular method: m6");
		}

}

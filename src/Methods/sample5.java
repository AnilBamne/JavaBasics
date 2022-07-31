package Methods;

public class sample5
{

	//4. non-static method call from diff/another class
	
		public static void main(String[] args) 
		{
			sample6 s6=new sample6();    //1. create object diff/another class
			s6.m7();                     //2. method call -> objectname.methodname();
			s6.m8();
			s6.m8();
		}

	
}

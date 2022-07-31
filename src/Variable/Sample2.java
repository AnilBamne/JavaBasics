package Variable;

public class Sample2 
{

	
	public static void main(String[] args)
	{
		//1. Variable declaration (Allocating/Reserving memory)
		String sname;       //datatype varibalename;
		String sdept;
		int srollnum;
		char sgrade;
		float sper;
		
		
		//2. Variable Initialization(Assigning or Inserting value)
		sname="Rahul";     //variablename = "variable value";
		sdept="Electrical";
		srollnum = 100;
		sgrade ='a';
		sper = 75.5f;
		
		
		//3. variable usage
		System.out.println(sname);
		System.out.println(sdept);
		System.out.println(srollnum);
		System.out.println(sgrade);
		System.out.println(sper);
		
		System.out.println(sname);   //re-use
	
	}

	
	
}

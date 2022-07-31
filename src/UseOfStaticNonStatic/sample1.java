package UseOfStaticNonStatic;

public class sample1
{

	public static void main(String[] args)
	{		
		Emp e1=new Emp();
		e1.empName="Pavan";
		e1.empID = 101;	
		//e1.empCEOName="abc";
		Emp.empCEOName="abc";
		
		Emp e2=new Emp();
		e2.empName="Mayur";
		e2.empID=102;
//		/e2.empCEOName="abc";
		Emp.empCEOName="abc";
		
		Emp e3=new Emp();
		e3.empName="suraj";
		e3.empID=103;
		//e3.empCEOName="xyz";
		Emp.empCEOName="xyz";
		
		
		e1.empDetails();
		e2.empDetails();
		e3.empDetails();
		
	}

	
}

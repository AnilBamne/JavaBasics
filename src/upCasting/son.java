package upCasting;

public class son extends father
{

	public void bike() 
	{
		System.out.println("bike: FZ V3");
	}
	
	
	public void car()            //override / update
	{
		System.out.println("car: Kia seltos");
	}
	
	public void money()         //override
	{
		System.out.println("money: 1L");
	}
	
//	public void home() 
//	{
//		System.out.println("Home: 2BHK");
//	}

}

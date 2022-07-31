package Array;

public class example2_StringArray 
{

	public static void main(String[] args)
	{
		
		
		String [] ar=new String[4];
		
		ar[0]="ramesh";
		ar[1]="mahesh";
		ar[2]="suresh";
		ar[3]="ganesh";
		
		
		System.out.println(ar[1]);    //mahesh
		System.out.println("The length of array is"+" : "+ar.length);    //4
		
		
		System.out.println("------print all data-------");
		
//		for(int i=0; i<=3; i++)
//		{
//			System.out.println(ar[i]);
//		}
		
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
	}

}

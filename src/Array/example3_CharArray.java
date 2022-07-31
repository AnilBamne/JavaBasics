package Array;

public class example3_CharArray 
{

	public static void main(String[] args)
	{
		
		char [] ar=new char[4];
		
		ar[0]='B';
		ar[1]='A';
		ar[2]='D';
		ar[3]='C';
				
		System.out.println(ar[1]);    //A
		System.out.println(ar.length);    //4
		
		
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

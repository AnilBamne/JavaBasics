package Array;

public class example1_intArray {

	
	public static void main(String[] args)
	{
		
		//step1: array declaration
		int [] ar=new int[5];
		
		//step2: array initialization
		ar[0]=40;
		ar[1]=10;
		ar[2]=50;
		ar[3]=30;
		ar[4]=20;
		//ar[5]=15;   //exception
		
		
		//step3: array usage
		System.out.println(ar[4]);   //40
		System.out.println("The length of array is"+" :"+ ar.length);    // 5
		
		
		System.out.println("---print all data from array---");
		
		//     0     5<=4
//		for(int i=0; i<=4; i++) 
//		{  //                 ar[4]
//			System.out.println(ar[i]);    //40 10 50 30 20
//		}
		
		for(int i=0; i<=ar.length-1; i++) 
		{                   
			System.out.println(ar[i]);   
		}
		
	}

}

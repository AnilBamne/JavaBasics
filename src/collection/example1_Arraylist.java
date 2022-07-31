package collection;

import java.util.ArrayList;

public class example1_Arraylist 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		
		al.add("anil");
		al.add("bamne");
		al.add(89.5f);
		al.add('A');
		al.add(1000);
		al.add(null);
		al.add(null);
		

		System.out.println(al);			//print the array list
		System.out.println(al.size());	//get the size of al
		System.out.println(al.get(3));	//print the element at index of 3
		System.out.println(al.isEmpty());
		System.out.println(al.contains(1000));
		
		
		System.out.println("---------------------");
		System.out.println(al);
		//add/insert info in between arraylist  --> right shift operation happens here
		al.add(1,"pandurang");
		System.out.println(al);
		
		System.out.println("--------------------------------");
		//remove/delete info in between arraylist --> left shift operation
		al.remove(4);
		System.out.println(al);
		
		System.out.println("----------------------------------");
		// modify or update elemets
		al.set(2, 92.4f);
		System.out.println(al);

		
		
		
		
		
	}

}

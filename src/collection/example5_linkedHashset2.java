package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class example5_linkedHashset2 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Rahul");
		lhs.add("jadhav");
		lhs.add('A');
		lhs.add(78.90f);
		lhs.add(null);
		
		
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(200));  //true

		
		
		lhs.add("Ram");
		System.out.println(lhs);
		
		
		lhs.remove(null);
		System.out.println(lhs);
		
		System.out.println("--- iterator curser ---");
		
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		System.out.println("---- for each loop  ----");
		for(Object a:lhs)
		{
			System.out.println(a);
		}
		
		
		
	}

}

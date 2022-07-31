package collection;

import java.util.HashSet;
import java.util.Iterator;

public class example4_Hashset 
{
	private static final String Bihar = null;

	public static void main(String[] args)
	{
		
		HashSet hs=new HashSet();
		hs.add("rahul");
		hs.add("kumar");
		hs.add(78.4f);
		hs.add('A');
		hs.add(null);
		hs.add(2000);
		
		
		System.out.println(hs);
		
		
		
		hs.add(200);
		hs.remove(2000);
		
		System.out.println(hs);
		
		
		
		System.out.println("----- curser iterator");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		System.out.println("---print all data for each loop---");

		for(Object s1:hs)
		{
			System.out.println(s1);
		}

		
	}

}

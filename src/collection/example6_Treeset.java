package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class example6_Treeset
{
	public static void main(String[] args) 
	{
		TreeSet tr=new TreeSet();
		
		tr.add(400);
		tr.add(500);
		tr.add(100);
		tr.add(300);
		tr.add(600);
		tr.add(200);  // only single duplicate values are stored
		tr.add(200);
		//tr.add(null);
	//	tr.add("anil"); does not allow diff. values only Homogenius values are allowed
		
		
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		System.out.println(tr.contains(100));
		System.out.println(tr.first());
		System.out.println(tr.last());
		
		
		System.out.println("----- Iterator   -----");
		Iterator itr=tr.iterator();
	
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		System.out.println("---  for each ---");
		for(Object a:tr)
		{
			System.out.println(a);
		}
		
		System.out.println("----------------");
		System.out.println(tr);
		
		System.out.println(tr.pollFirst());//find and remove first or lowes value
		System.out.println(tr.pollLast());//finds and removes last value
		System.out.println(tr);
	}

}

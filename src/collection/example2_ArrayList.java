package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example2_ArrayList {

	public static void main(String[] args)
	{ 
		ArrayList al=new ArrayList();
		
		al.add("Rahul");
		al.add("raj");
		al.add(36);
		al.add('B');
		al.add(57.8f);
		al.add(2000);
		al.add(null);
		al.add(null);
		
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		System.out.println(al.isEmpty());
		System.out.println(al.contains('B'));
		
		
		System.out.println("-----------------------");
		//add element
		al.add(1, "kumar");
		System.out.println(al);
		
		System.out.println("------------------------");
		//remove element
		al.remove(6);
		System.out.println(al);
		
		System.out.println("------------------------");
		
		
		System.out.println("print all data using iterator cursor---");
		
		Iterator itr = al.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
			
		}
		
		
		System.out.println("-----------------------------");
		
		System.out.println("print all data using list iterator cursor");
		
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
			
		}
		
		
		System.out.println("---print all data using for loop---");
		for(int i=0; i<=al.size()-1; i++) 
		{
			System.out.println(al.get(i));
		}
		
		
		System.out.println("---print all data using for each loop---");
		
		for(Object s1:al) 
		{
			System.out.println(s1);
		}
		

		
	}

}

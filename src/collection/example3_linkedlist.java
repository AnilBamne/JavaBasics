package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example3_linkedlist {

	public static void main(String[] args) 
	{
		LinkedList LL=new LinkedList();
		LL.add("Ganesh");
		LL.add("kshirsagar");
		LL.add(87.6f);
		LL.add('A');
		LL.add("Baswakalyan");
		LL.add(null);
		LL.add(null);
		
		
		System.out.println(LL);
		System.out.println(LL.getFirst());
		System.out.println(LL.getLast());
		System.out.println(LL.isEmpty());
		System.out.println(LL.size());
		System.out.println(LL.contains("kshirsagar"));
		
		
		System.out.println("------------------------------");
		//add data in list
	
		System.out.println(LL);
		LL.add(2, "Akshay");
		System.out.println(LL);
		
		
		System.out.println("------------------------------");
		//remove data from list
		LL.remove("Ganesh");
		System.out.println(LL);
		
		System.out.println("-------------------------------");
		//modify or update data in list
		LL.set(1,"Ganesh");
		System.out.println(LL);
		
		System.out.println("-------------------------------");
		System.out.println("print all data using iterator");
		// print all data using iterator
		Iterator itr= LL.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	 
		System.out.println("----print all data using Listiterator----");
		// print all data using listiterator
		ListIterator litr = LL.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("--- Print all data using loop ---");
		
		for(int i=0; i<=LL.size()-1;i++)
		{
			System.out.println(LL.get(i));
		}

		System.out.println("----  print all data using forEach loop  ---");
		
		for(Object ll:LL)
		{
			System.out.println(ll);
		}
		 ;
	}

}

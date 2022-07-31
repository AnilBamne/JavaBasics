package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example2_vector 
{
	public static void main(String[] args) 
	{
		
		Vector v=new Vector();
		v.add("rahul");
		v.add("jaiswal");
		v.add('b');
		v.add(54.3f);
		v.add(100);
		v.add(null);
		v.add(null);
		
		
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.get(2));
		System.out.println(v.size());
		System.out.println(v.remove(4));
		System.out.println(v);
		
		

		System.out.println(v);
		//add/insert info in between Vector  --> right shift operation
		v.add(4,500);
		System.out.println(v);
		
		
		//remove/delete info in between Vector --> left shift operation
		v.remove(4);
		System.out.println(v);
				
		//update/modify info
		v.set(3, 75.5f);
		System.out.println(v);
		
		
		System.out.println("---print vector data using iterator cursor---");
		
		Iterator itr = v.iterator();		
		while(itr.hasNext())  //-->true   --> fVse
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("---print vector data using ListIterator cursor---");
		
		ListIterator litr = v.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		
		System.out.println("---print vector data using for loop---");
		for(int i=0; i<=v.size()-1; i++) 
		{
			System.out.println(v.get(i));
		}
		
		
		System.out.println("---print vector data using for each loop---");
		
		for(Object s1:v) 
		{
			System.out.println(s1);
		}
		
		
		System.out.println("---print vector data using enumeration cursor---");
		
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		

		
		
	}

}

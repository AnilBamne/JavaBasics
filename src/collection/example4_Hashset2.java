package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class example4_Hashset2 
{
	public static void main(String[]args) 
	{
		
		ArrayList al=new ArrayList();   
		al.add("rahul");
		al.add(100);
		al.add('A');
		al.add(65.5f);
		al.add("rahul");  
		al.add(null);       
		al.add(null);     	
		System.out.println(al);
		
		HashSet hs=new HashSet(al);//hash set does not alloew duplicate nalues
		System.out.println(hs);
		
	}

}

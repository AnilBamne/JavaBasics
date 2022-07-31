package collection;

import java.util.ArrayList;

public class example7_Generic2 
{
	public static void main(String[] args) {
		
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("abc");
		al.add("xyz");
		//al.add(65.5f);  // integer values are not allowed in string type arraylist
		//al.add('A');	// char also not allowed
		al.add("65.5");
		al.add("a");   //only strings allowed
		
		System.out.println(al);
		

	}

}

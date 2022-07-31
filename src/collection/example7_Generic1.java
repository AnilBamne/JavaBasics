package collection;

import java.util.TreeSet;

public class example7_Generic1 
{
	public static void main(String[] args) {
		
		TreeSet<Integer> trs= new TreeSet<Integer>();
		
		trs.add(26);
		trs.add(76);
		trs.add(34);
		trs.add(80);
		
		System.out.println(trs);
		
		for(Integer s1:trs)
		{
			System.out.println(s1);
		}
	}

}

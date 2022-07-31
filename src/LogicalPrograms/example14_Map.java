package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

//1. put(k,v)   --> use to insert k, v pair data into hashmap
//2. containsKey(K) --> use to verify given key is present or not 
//3. get(k)    --> use to get value of given key

public class example14_Map
{
	public static void main(String[] args) {
		
		HashMap<String, Integer> mp=new HashMap<String, Integer>();
		
		mp.put("Rahul", 101);
		mp.put("Ganesh", 102);
		mp.put("mahesh", 102);
		
		
		System.out.println(mp.containsKey("Rahul")); //true
				
		System.out.println(mp.get("mahesh"));     //102
		
		
		System.out.println("----print all keys--------");
	
		Set<String> allKeys = mp.keySet();
		for(String key: allKeys)
		{
			System.out.println(key);
		}
		
		
		System.out.println("----print all keys-values--------");
		for(String key:allKeys) 
		{
			System.out.println(key+": "+mp.get(key));
		}
				
	}

}

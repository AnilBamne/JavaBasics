package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;


public class example14_Count_Reapeating_Char_In_String_Using_Hashmap 
{
	
	public static void main(String[] args) 
	{
		
		String org="abcab";

		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<=org.length()-1;i++)
		{
			char s1 = org.charAt(i);
			
			if(map.containsKey(s1))
			{
				map.put(s1,map.get(s1)+1);
			}
			else
			{
				map.put(s1, 1);
			}
			
			Set<Character> keys = map.keySet();
			
			
			//print occurence of each char
//			for (Character key : keys) 
//			{	
//				System.out.println(key +": "+ map.get(key));
//			}
			

			//print only duplicate char
			for (Character key : keys) 
			{
				if(map.get(key)>1)
				{
					System.out.println(key +": "+ map.get(key));
				}
			}
			
			//System.out.println("a: "+ map.get('a'));
			

			
			

		}
		
	}

}

package String_class;

public class demo5 
{

		public static void main(String[] args)
		{		
			String s1="velocity";
			String s2="ABCD";
			String s3="abcd";
			String s4="my name is rahul";
			String s5="";
			String s6="abcaba";
			String s7="suraj";
			
			String s8="java classes";
					
			System.out.println(s1.substring(1, 4));  //1-3     elo    prints btwn 1 and 4th char.
			System.out.println(s1.substring(4));   //city
			
			System.out.println("-----");
			
			System.out.println(s2.concat(s3));   //ABCDabcd
			System.out.println(s2+s3);    //ABCDabcd
			System.out.println(s8.replace("java", "selenium"));   //selenium classes		
			
			System.out.println("-----");
			
			System.out.println(s1.length());      //8
			System.out.println(s1.toUpperCase());   //VELOCITY
			System.out.println(s2.toLowerCase());   //abcd
			
			System.out.println(s2.equals(s3));   //false
			System.out.println(s2.equalsIgnoreCase(s3));  // true
			System.out.println(s4.contains("is"));     //true
			
			System.out.println("------");
			
			System.out.println(s5.isEmpty());    //true
			System.out.println(s1.charAt(4));   //c
			
			System.out.println(s6.indexOf('b'));  //1
			System.out.println(s6.lastIndexOf('b'));   //4
			
			System.out.println("------");
			System.out.println(s4.startsWith("my"));  //true
			System.out.println(s4.endsWith("rahul"));   //true
			
			
			
		}


	
}

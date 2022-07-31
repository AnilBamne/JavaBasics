package String_class;

public class demo4 
{


	public static void main(String[] args)
	{	
		//object Creation of string
		//1. without using new keyword   --> constant pool area
		String s1="abc";
		String s2="abc";
		String s3="abc1";
		
		//2. using new keyword   --> non-constant pool area
		String s4=new String("abc");
		String s5=new String("abc");
		String s6=new String("abc1");
		
		
		System.out.println(s1==s2);    //true
		System.out.println(s1==s3);   //false
		System.out.println(s1==s4);  //false
		System.out.println(s4==s5);  //false
		
		
		
	}

}

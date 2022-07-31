package Generalization;

public class TestGeneralization 
{
	public static void main(String[] args) 
	{
		System.out.println("******* Features of Jio *******");
		System.out.println("          ");
		Jio j=new Jio();
		j.sms();
		j.calling();
		j.data();
		j.newFeatureA();
		
		System.out.println("          ");
		System.out.println("          ");
		
		System.out.println("******* Features of Airtel *******");
		System.out.println("          ");
		Airtel a=new Airtel();
		a.sms();
		a.calling();
		a.data();
		a.newFeatureB();
		
		System.out.println("          ");
		System.out.println("          ");
		
		System.out.println("******* Features of Idea *******");
		System.out.println("          ");
		Idea i=new Idea();
		i.sms();
		i.calling();
		i.data();
		i.newFeatureC();
		
	}

}

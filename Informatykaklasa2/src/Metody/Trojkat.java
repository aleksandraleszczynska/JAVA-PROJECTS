package Metody;

public class Trojkat 

{
	public static double pole(double a, double h) 
	
	{
		return a*h /2;
	}
	
	public static double pole1(double a, double b, double c)
	
	{
		double p = (a+b+c)/2;
		
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));	
	}
	
	public static void main(String[] args)
	
	{
		System.out.println(pole(4,6));
		System.out.println(pole1(4,3,2));
	
	}
	
	
	
	
	
}

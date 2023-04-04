package Metody;

import java.util.Scanner;

public class Kalkulator {
	
	public static void main(String[] args) 
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		String add = "dodawanie";
		String sub = "odejmowanie";
		String tim = "mnożenie";
		String div = "dzielenie";
		
		System.out.println("Podaj pierwszą liczbę");
		
		int a = sc.nextInt();
		
		System.out.println("Podaj drugą liczbę");
		
		int b = sc.nextInt();
		
		System.out.println("Wybierz spośród podanych: dodawanie, odejmowanie, mnożenie, dzielenie");
		
		String c = sc.next();
		
		
		if(c.equals(add)) 
		{
			System.out.println(dodawanie(a,b));
		}
		
		if(c.equals(sub)) 
		{
			System.out.println(odejmowanie(a,b));
		}
		
		if(c.equals(tim)) 
		{
			System.out.println(mnożenie(a,b));
		}
		
		if(c.equals(div)) 
		{
			System.out.println(dzielenie(a,b));
		}
		
		
	}

	public static int dodawanie(int a, int b)
	
	
	{
		return a + b;
	}


	public static int odejmowanie(int a, int b)
	
	
	{
		return a - b;
	}
	

	public static int mnożenie(int a, int b)
	
	
	{
		return a * b;
	}
	
	
	public static int dzielenie(int a, int b)
	
	
	{
		return a * b;
	}
	

	
	
}

package Metody;

import java.util.Scanner;

//Napisz i wywołaj metodę przyjmującą długości boków prostokąta i zwracającą jego pole.


public class zadanie18 {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj długośc pierwszego boku");
		
		double a = sc.nextDouble();
		
		System.out.println("Podaj długość drugiego boku");
		
		double b = sc.nextDouble();
		
		pole(a,b);
		
		System.out.println(pole(a,b));
	}
		
		public static double pole(double a, double b)
		
		{
		 return a*b;
		}
		

	

}

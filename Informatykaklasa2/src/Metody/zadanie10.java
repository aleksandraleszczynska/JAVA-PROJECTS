package Metody;

import java.util.Scanner;

//Napisz i wywołaj metodę przyjmującą twój rok urodzenia i zwracającą Twój wiek.


public class zadanie10 {

	public static void main(String[] args) 
	
	{
		System.out.println("Podaj rok urodzenia");
		
		Scanner sc  = new Scanner(System.in);
		
		int rok = sc.nextInt();
		
		wiek(rok);
		
		
		System.out.println(wiek(rok));

	}
		
		public static int wiek(int rok) 
		
		{
			return 2022 - rok ;
			
		}
	
}



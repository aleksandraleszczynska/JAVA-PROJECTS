package Zadania;

import java.util.Scanner;

public class Zadanieb {

	public static void main(String[] args) 
	
	{
		double liczba1, liczba2, liczba3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj pierwsz� liczb�");	
		liczba1 = sc.nextDouble();
		
		System.out.println("Podaj drug� liczb�");
		liczba2 = sc.nextDouble();
		
		System.out.println("Podaj trzeci� liczb�");
		liczba3 = sc.nextDouble();
		
		if ( liczba1 > liczba2 && liczba1 > liczba3)
		
		{
			System.out.println("Najwieksz� liczb� jest " + liczba1 );
		}
		
		if ( liczba2 > liczba1 && liczba2 > liczba3)
			
		{
			System.out.println("Najwieksz� liczb� jest " + liczba2 );
		}
		
		if ( liczba3 > liczba2 && liczba3 > liczba1)
			
		{
			System.out.println("Najwieksz� liczb� jest " + liczba3 );
		}
		

	}

}

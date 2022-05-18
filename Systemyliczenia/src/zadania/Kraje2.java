package zadania;

import java.util.Scanner;

public class Kraje2 {

	public static void main(String[] args) 
	
	
	{
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		while (x == 0 )
		
		{
			
			System.out.println("podaj podstawę systemu");
			int p = sc.nextInt();
		
			if (p > 9) { System.out.println("Podaj mniejszą liczbę");}
			else if  (p < 2) { System.out.println("Podaj większą liczbę");}
			else if (p <= 9 && p>= 2) x = 1;
			}
			
		
		System.out.println("Podaj ilość znaków liczby");
		int n = sc.nextInt();
		
		System.out.println("podaj liczbę w wybranym systemie");
		int k = sc.nextInt();
		
		
		
			}
		
		
		


}
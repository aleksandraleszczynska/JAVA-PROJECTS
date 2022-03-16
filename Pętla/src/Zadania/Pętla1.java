package Zadania;

import java.util.Scanner;

public class Pêtla1 {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Podaj iloœæ liczb które chcesz dodaæ");
		n = sc.nextInt();
		
		int suma = 0;
		int licznik = 0;
		int liczba;
		
		while(licznik < n )
		{
			System.out.println("Wpisz kolejn¹ wartoœæ");
			
			liczba = sc.nextInt();
			
			suma = suma + liczba;
			
			licznik = licznik + 1;
			
			
		}
		
		System.out.println("Suma: " + suma);
		

	}

}

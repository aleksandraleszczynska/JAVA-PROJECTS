package Zadania;

import java.util.Scanner;

public class P�tla1 {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Podaj ilo�� liczb kt�re chcesz doda�");
		n = sc.nextInt();
		
		int suma = 0;
		int licznik = 0;
		int liczba;
		
		while(licznik < n )
		{
			System.out.println("Wpisz kolejn� warto��");
			
			liczba = sc.nextInt();
			
			suma = suma + liczba;
			
			licznik = licznik + 1;
			
			
		}
		
		System.out.println("Suma: " + suma);
		

	}

}

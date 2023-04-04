package Metody;

import java.util.Scanner;

public class SchematHornera {


		public static void main(String[] args) 
		
		{
			//Program dla wielomianu : 2x^3 + 3x^2 - 4x - 8//
			
			
			
			Scanner sc = new Scanner(System.in);
			
			//System.out.println("Podaj długość tablicy");
			
			//int długość = sc.nextInt();
			

			System.out.println("Podaj wartość najwyższej potęgi");
			
			int stopień = sc.nextInt();
			
			int długość = stopień +1;
			
			System.out.println("Podaj " + długość + " liczb do tablicy");
			
			int [] tab = new int [długość];
			
			for(int i = 0; i < tab.length; i++)
			{
			tab[i] = sc.nextInt();
			}
			
			
			System.out.println("Podaj wartość x");
			
			int x = sc.nextInt();
			
			//int x = 2;
			
			//int tab [] = {2,3,-4,-8};
			
			//int stopień = 3;
			
			System.out.println(horner(tab, stopień, x));
			
			}
		
		public static int horner(int tab[], int stopień, int x) 
		
		{
			/*if (stopień == 0) 
			
			{
				return tab[0];
			}
			
			return x*horner(tab, stopień-1, x) + tab[stopień];*/
			
			
			
			int wynik = tab[0];
	 
			for(int i = 1; i <= stopień; i++) 
			{
			wynik = x * wynik + tab[i];
			}
			return wynik;
	}
	}



package Metody;

import java.util.Arrays;
import java.util.Scanner;

public class zdanie35 {

	public static void main(String[] args) 
	
	
	{

		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj długość tablicy");
		
		int długość = sc.nextInt();
		
		System.out.println("Podaj " + długość + " liczb do tablicy");
		
		int [] liczby = new int [długość];
		
		for(int i = 0; i < liczby.length; i++)
		{
		liczby[i] = sc.nextInt();
		}
		
		System.out.println(metoda(liczby));
		
		
		}
		
		public static int metoda(int liczby[]) 
		
		{
			int suma=0;
			for(int i = 0; i < liczby.length; i++)
			{
			suma += liczby[i];
			}
			
			return suma;
			
		}

	}



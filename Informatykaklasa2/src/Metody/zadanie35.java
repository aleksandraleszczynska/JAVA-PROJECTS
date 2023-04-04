package Metody;

import java.util.Arrays;
import java.util.Scanner;

public class zadanie35 

//Napisz i wywołaj metodę przyjmującą tablicę liczb typu int i wyświetlającą ich sumę.


{

	public static void main(String[] args) 
	
	{
		tablica(suma);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj 10 liczb do tablicy");
		
		int [] liczby = new int [10];
		
		for(int i = 0; i < liczby.length; i++)
		{
		liczby[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(liczby));
		
		int suma = 0;
		
		for(int i = 0; i < liczby.length; i++)
		{
		suma += liczby[i];
		}}
		
		public static void tablica(suma)
		
		{
			System.out.println("Suma liczb z tablicy wynosi: " + suma);
		}

		
	
		
	
}
	


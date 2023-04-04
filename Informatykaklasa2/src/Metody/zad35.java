package Metody;

import java.util.Arrays;
import java.util.Scanner;

public class zad35 {

	public static void main(String[] args) 
	
	{
		
	//Napisz i wywołaj metodę przyjmującą tablicę liczb typu int i wyświetlającą ich sumę.
		
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
		}

		System.out.println("Suma liczb z tablicy wynosi: " + suma);
	
	}

}

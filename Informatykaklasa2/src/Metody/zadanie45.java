package Metody;

import java.util.Arrays;
import java.util.Random;

//Napisz i wywołaj metodę zwracającą tablicę liczb typu int zainicjowaną za pomocą liczb losowych.


public class zadanie45 {

	public static void main(String[] args) 
	
	{
		
		int[] liczby = tablica();
		
		for (int i = 0; i < liczby.length; i++) 
		
		{
			System.out.print(liczby[i] + " ");
		}
		
		
	}
	
	public static int [] tablica()
	
	{
		int[] liczby = new int[10];
		
		Random rd = new Random();
		
		for(int i = 0; i < liczby.length; i++)
		{
			liczby[i] = rd.nextInt(10);
		}
		
		return liczby;
	}
}


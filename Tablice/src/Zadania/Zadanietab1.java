package Zadania;


//Napisz program deklaruj¹cy i inicjuj¹cy 10-elementow¹ tablicê przeznaczon¹ do przechowywania 
//liczb ca³kowitych losowymi wartoœciami z zakresu od 0 do 9. Wyœwietl przypisane wartoœci.

//

import java.util.Arrays;
import java.util.Random;

public class Zadanietab1 {

	public static void main(String[] args) 
	
	{
		
		
		Random rd = new Random();
		int[] liczby = new int[10];
		for(int i = 0; i < liczby.length; i++)
		{
		liczby[i] = rd.nextInt(10);
		}
		
		System.out.println("Liczby z tablicy to : " + Arrays.toString(liczby));
	}

}


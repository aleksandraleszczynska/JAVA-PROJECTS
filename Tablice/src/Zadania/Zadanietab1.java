package Zadania;


//Napisz program deklaruj�cy i inicjuj�cy 10-elementow� tablic� przeznaczon� do przechowywania 
//liczb ca�kowitych losowymi warto�ciami z zakresu od 0 do 9. Wy�wietl przypisane warto�ci.

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


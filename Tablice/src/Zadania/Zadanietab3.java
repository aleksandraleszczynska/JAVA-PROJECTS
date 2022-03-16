package Zadania;

import java.util.Arrays;
import java.util.Random;

//Napisz program reprezentuj¹cy grê w koœci, tj. wyrzucenie piêciu koœci. 

public class Zadanietab3 {

	public static void main(String[] args) 
	
	{ Random rd = new Random();
	int[] liczby = new int [5];
	for(int i = 0; i < liczby.length; i++)
	{
	liczby[i] = rd.nextInt(6)+1;
	}
	
	System.out.println("Wyrzucone liczby to : " + Arrays.toString(liczby));
}
		
	}



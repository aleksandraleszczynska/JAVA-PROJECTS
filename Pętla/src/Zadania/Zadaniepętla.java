package Zadania;


//Wygeneruj dwie liczby z przedzia�u od 1 do 6 i sprawd czy s� r�wne

import java.util.Random;
import java.util.Scanner;

public class Zadaniep�tla {

	public static void main(String[] args) 
	
	{
	
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		Random r = new Random();
		
		for(int i = 0; i < 3; i++)
		{
		n1 = r.nextInt(7);
		n2 = r.nextInt(7);
		
		if(n1 == n2)
		{
			System.out.println("Liczby "+ n1 +" i "+ n2 + " s� r�wne");
		}
		else
		{
			System.out.println("Liczby "+ n1 +" i "+ n2 + " nie s� r�wne");
		

	}
		}
	}
}

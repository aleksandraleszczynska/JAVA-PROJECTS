package Zadania;

import java.util.Random;
import java.util.Scanner;

//Napisz program generuj�cy liczby losowe podzielne przez liczb� wprowadzon� przez u�ytkownika na pocz�tku programu


public class ZadaniedLiczbyLosowe {

	public static void main(String[] args) {
		
			
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Wpisz warto��");
		x = sc.nextInt();
		
	Random r = new Random();
	
	int k;
	 
	for(int licznik = 0; licznik < 100; licznik ++){
	
	k = r.nextInt(100);
		
		if(k%x == 0)
		{
			System.out.println(k);}
		
	}

	
	}
}


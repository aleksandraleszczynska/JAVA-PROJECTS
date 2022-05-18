package zadania;

import java.util.Scanner;

public class kraje3 {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj podstawę systemu liczenia");
		int p = sc.nextInt();
		System.out.println("Podaj ilość cyfr podanej liczby");
		int n = sc.nextInt();
		int x = 0;
		
		int[] tablica = new int[n];
		
		System.out.println("Podaj liczbę w systemie pozycyjnym: ");
		
		for(int i = n; i > 0; i--)
		{
			tablica[n] = sc.nextInt();
		}		
		
		for(int i = n; i > 0; i--)
		{
			System.out.println(tablica[i]);
		}		
}}



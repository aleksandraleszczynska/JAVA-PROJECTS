package zadania;

import java.util.Scanner;

public class kraje4 {

	public static void main(String[] args) 
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj podstawę systemu liczenia");
		int p = sc.nextInt();
		System.out.println("Podaj liczbę w systemie dziesiętnym");
		int k = sc.nextInt();
		
		while (k > 0)
		{
			System.out.println(k%p);
			k = k/p;
		
		}
		
		System.out.println();

	}

}

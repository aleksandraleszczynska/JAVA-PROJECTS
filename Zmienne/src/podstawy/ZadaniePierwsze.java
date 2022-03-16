package podstawy;

import java.util.Scanner;

public class ZadaniePierwsze {

	public static void main(String[] args)
	
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Obliczanie pola kwadratu");
		
		System.out.println("Podaj d³ugosc boku");
		
		double x = sc.nextDouble();
		
		System.out.println("Pole kwadratu o podanym boku jest równe " + x*x);
		
		
	}

}

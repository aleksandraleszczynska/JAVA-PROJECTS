package podstawy;

import java.util.Scanner;

public class ZadanieTrzecie {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Obliczanie pr�dko�ci samocgodu (km/h)");
		
		System.out.println("Podaj pr�dko�� w m/min");
		
		double x = sc.nextDouble();
		
		System.out.println("Pr�dko�c samochodu jad�cego z podan� pr�dko�ci� wynosi " + x*0.001*60 + " km/h");
	}

}

package podstawy;

import java.util.Scanner;

public class ZadanieTrzecie {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Obliczanie prêdkoœci samocgodu (km/h)");
		
		System.out.println("Podaj prêdkoœæ w m/min");
		
		double x = sc.nextDouble();
		
		System.out.println("Prêdkoœc samochodu jad¹cego z podan¹ prêdkoœci¹ wynosi " + x*0.001*60 + " km/h");
	}

}

package podstawy;

import java.util.Scanner;

public class ZadanieCzwarte {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Obliczanie pola piêciok¹ta");
		
		System.out.println("Podaj bok piêciok¹ta");
		
		double x = sc.nextDouble();
		
		System.out.println("Pole powierzchni piêciok¹ta o podanym boku wynosi " + x*x*Math.sqrt(25+10*Math.sqrt(5)));
		
	

	}

}

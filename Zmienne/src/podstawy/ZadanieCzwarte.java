package podstawy;

import java.util.Scanner;

public class ZadanieCzwarte {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Obliczanie pola pięciokąta");
		
		System.out.println("Podaj bok pięciokąta");
		
		double x = sc.nextDouble();
		
		System.out.println("Pole powierzchni pięciokąta o podanym boku wynosi " + x*x*Math.sqrt(25+10*Math.sqrt(5)));
		
	

	}

}

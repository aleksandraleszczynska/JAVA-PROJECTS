package podstawy;

import java.util.Scanner;

public class ZadanieDrugie {

	public static void main(String[] args) 
	
	
	{
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Obliczanie obwodu ko³a");
	   
	   System.out.println("Podaj d³ugoœæ promienia ko³a");
	   
	   double x = sc.nextDouble();
	   
	   System.out.println("D³ugoœæ ko³a o podanym promieniu jest równe oko³o " + x*(2*3.14));

	}

}

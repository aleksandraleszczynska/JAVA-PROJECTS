package podstawy;

import java.util.Scanner;

public class ZadanieDrugie {

	public static void main(String[] args) 
	
	
	{
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Obliczanie obwodu ko�a");
	   
	   System.out.println("Podaj d�ugo�� promienia ko�a");
	   
	   double x = sc.nextDouble();
	   
	   System.out.println("D�ugo�� ko�a o podanym promieniu jest r�wne oko�o " + x*(2*3.14));

	}

}

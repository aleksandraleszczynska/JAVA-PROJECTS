package Zadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class njskcavl {

	public static void main(String[] args)  throws FileNotFoundException
	
	{
        File plik = new File ("tak.txt");
		
		Scanner sc = new Scanner(plik);
		
		int suma = 0;
		int tym = 0;
		int ilosc = 0;
		int cena = 0;
		
		while(sc.hasNextLine())
			
		{
			System.out.print(sc.next() + " ");
			ilosc = sc.nextInt();
			cena = sc.nextInt();
			tym = ilosc * cena;
			suma += tym;
			System.out.println(ilosc + " " + cena);	
			
		}
		
		
		
		System.out.println(suma/100 + " zl");
		}

	
}

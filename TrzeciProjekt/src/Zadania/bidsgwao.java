package Zadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bidsgwao {

	public static void main(String[] args) throws FileNotFoundException
	
	
	{
		File plik = new File ("dasfk.txt");
		
		Scanner sc = new Scanner(plik);
		
		//String s = sc.next();
		
		int licznik = 0;
	while(sc.hasNext())
	{
		sc.next();		
		licznik++;
	}
	
	System.out.println(licznik);
	}

}

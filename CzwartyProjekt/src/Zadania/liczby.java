package Zadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class liczby {

	public static void main(String[] args) throws FileNotFoundException
	
	{
		File plik = new File ("tak.txt");
		
		Scanner sc = new Scanner(plik);
		
		int iloczyn = 0;
		
		while(sc.hasNextLine())
			
		{
			
			iloczyn += sc.nextInt() * sc.nextInt();
		}
		
		
		System.out.println(iloczyn);

	}

}

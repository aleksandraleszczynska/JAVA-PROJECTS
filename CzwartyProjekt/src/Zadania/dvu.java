package Zadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dvu {

	public static void main(String[] args) throws FileNotFoundException
	
	
	
	{
		
File plik = new File ("tak.txt");
		
		Scanner sc = new Scanner(plik);
		
		int suma = 0;
		
		while(sc.hasNextLine())
		{
			
			suma += sc.nextInt() * sc.nextInt();
		}
		
		
		System.out.println(suma);

	}

		
	}



package Zadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class jckzfblsa {

	public static void main(String[] args) throws FileNotFoundException
	
	
	{
		
		
        File plik = new File ("bdsbd.txt");
		
		Scanner sc = new Scanner(plik);
		
		String[] liczby = new String[17];
		
		for(int i = 0; i < 17; i++)
			
		{
		
		liczby[i] = sc.nextLine();
			for (int k = 0; k < liczby[i].size(); k++) {
				
			}
		
		}
		
		for ( int i = 0; i < 17; i++) 
		{
			System.out.println(liczby[i]);
		}
	
	}

}


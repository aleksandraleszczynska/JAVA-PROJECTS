package Zadania;

import java.util.Scanner;

public class TrzyLiczby {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		int licznik = 0;
		int liczba;
			
		while(licznik < 3) 
		
		{
			System.out.println("Wpisz kolejn¹ wartoœæ");
			liczba = sc.nextInt();
			suma = suma + liczba;
			 licznik = licznik + 1;
			
		}
  
		System.out.println("Suma: " + suma);
		
	}

                        }

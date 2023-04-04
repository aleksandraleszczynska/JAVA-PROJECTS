package Metody;

/*Napisz i wywołaj metodę zwracającą tablicę liczb typu int zainicjowaną ręcznie za pomocą {} .*/


public class zadanie44 {

     public static void tablica (int[]t ) 
	
	{
		for(int i =0; i < t.length; i++)
			
			System.out.println(t[i]);
	}
	
	
		public static void main(String[] args)
		
		{
			int[] tab = {6,5,3,4};
			
			tablica(tab);
		}
		
		
		
	}


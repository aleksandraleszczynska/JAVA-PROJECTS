package Metody;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args)
	
	{
		System.out.println("Podaj swoje imię");
		
		Scanner sc  = new Scanner(System.in);
		
		String imie = sc.next();
		
		System.out.println("Podaj swoje nazwisko");
		
		String nazwisko  = sc.next();
		
		hello5(imie, nazwisko);
		
		System.out.println(hello5(imie, nazwisko));
		
	
		//hello3("Aleksandra", " Leszczyńska");
	}

		public static void hello()
		
	{
		 System.out.println("Aleksdandra Leszczyńska");
			
	}
		
		
		public static void hello2(String name)
		
		{
			 System.out.println(name);
				
		}
		
		public static void hello3(String imie, String nazwisko)
		
		{
			 System.out.println(imie + nazwisko);
		}
		
        public static void hello4(String imie, String nazwisko)
		
		{
			 System.out.println(imie + " " + nazwisko);
		}
        
        public static String hello5(String imie, String nazwisko)
		
      		{
      			 return imie + " " + nazwisko;
      		}


}

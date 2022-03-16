package Zadania;

import java.util.Scanner;


public class Zadaniee {

	public static void main(String[] args) 
	
	{
	  double x;
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Podaj rok");
	  
	  x = sc.nextDouble();
	  
	  if (( x%4 == 0 || x%400 == 0) && x%100 != 0)
		
	  {
		  System.out.println("To jest rok przestêpny"); 
	  }
	  
	  else 
		  
	  { 
		  System.out.println("To nie jest rok przestepny");
	  }
		  
	  
}

	}
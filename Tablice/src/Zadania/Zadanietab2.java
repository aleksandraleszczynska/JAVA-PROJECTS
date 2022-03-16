package Zadania;

import java.util.Random;

//Napisz program reprezentuj¹cy rzut pojedyncz¹ monet¹,
//w wyniku której wypada albo "orze³" albo "reszka".

public class Zadanietab2 {

	public static void main(String[] args) 
	
	{  
	
	String [] orze³_czy_reszka = new String[] { "orze³","reszka" };
	
	double a = Math.random();
	
	long los = Math.round(a);
	
	
	 System.out.println(orze³_czy_reszka[(int) los]);
	
	
	
	}

	}




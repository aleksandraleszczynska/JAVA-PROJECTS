package Zadania;

import java.util.Random;

//Napisz program reprezentuj�cy rzut pojedyncz� monet�,
//w wyniku kt�rej wypada albo "orze�" albo "reszka".

public class Zadanietab2 {

	public static void main(String[] args) 
	
	{  
	
	String [] orze�_czy_reszka = new String[] { "orze�","reszka" };
	
	double a = Math.random();
	
	long los = Math.round(a);
	
	
	 System.out.println(orze�_czy_reszka[(int) los]);
	
	
	
	}

	}




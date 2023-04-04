package cos;

import java.util.Scanner;

public class Euklides {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Podaj pierwszą liczbę");
		
		int a = sc.nextInt();
		
		System.out.println("Podaj druga liczbę");
		
		int b = sc.nextInt();
		
		System.out.println("NWD wynosi: " + NWD(a,b));
		
	}
	
	public static int NWD(int a, int b) 
	
	{
		if(a == b) { return a;}
		
		if (a>b) { a= a-b;}
		
		if(b>a) { b = b-a;}
		
		return NWD(a,b);	
	}

}

package Rysunki;

import java.util.Scanner;

public class Drzewko {

	public static void main(String[] args) 
	
	{
		
		StdDraw.setCanvasSize(500,500);
		StdDraw.setYscale(-100,100);
		StdDraw.setXscale(-100,100);
		StdDraw.setPenRadius(0.003);
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj wartość x :");
		
		int x = sc.nextInt();
		
		System.out.println("Podaj wartość y :");
		
		int y = sc.nextInt();
		
		System.out.println("Podaj długość gałęzi :");
		
		int l = sc.nextInt();
		
		System.out.println("Podaj kąt (w stopniach) :");
		
		int k = sc.nextInt();
		
		double x2 = x;
		double y2 = y + l;		
				
		StdDraw.line(x,y,x2,y2);
		
		prawica(x2,y2,k,l);
		

	}
	
	public static void prawica(double x, double y, double k, double l) 
	
	{
		
		double x3 = x + Math.cos(Math.toRadians(k)) * l;
		double y3 = y + Math.sin(Math.toRadians(k)) * l;
		
		
		
	}

}

package Rysunki;

import java.util.Scanner;

public class Fraktal {

	
	public static int rekurencja;
	
	public static void main(String[] args) 
	
	{
		StdDraw.setCanvasSize(500,500);
		StdDraw.setXscale(-100, +100);
		StdDraw.setYscale(-100, +100);
		StdDraw.setPenRadius(0.004);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj wartość współrzędnej x");
		
		int x = sc.nextInt();
		
		System.out.println("Podaj wartość współrzędnej y");
		
		int y = sc.nextInt();
		
		System.out.println("Podaj długość boku");
		
		int bok = sc.nextInt();
		
		System.out.println("Podaj ilość powtórzeń");
		
		rekurencja = sc.nextInt();
		
		trojkat(x, y, bok, 0);
	}
	
	
	public static void trojkat(double x, double y, double bok, int pow) 
	
		{
		pow++;
		if (pow > rekurencja) return;
		
		double pos2x = x + bok;	
		double pos2y = y;
		double pos3x = x + bok / 2;
		double pos3y = y + bok * Math.sqrt(3) / 2;
				
		
		StdDraw.line(x, y, pos2x, pos2y);
		
		StdDraw.line(pos2x, pos2y, pos3x, pos3y);
		
		StdDraw.line(pos3x, pos3y, x, y);
		
		double pos12x = (x + pos2x) / 2;
		double pos12y = (y + pos2y) / 2;
		double pos31x = (x + pos3x) / 2;
		double pos31y = (y + pos3y) / 2;
		
		trojkat (pos12x, pos12y, bok/2, pow);
		trojkat (pos31x, pos31y, bok/2, pow);
		trojkat (x, y, bok/2, pow);
		
		
		
	
		
		
	}

}

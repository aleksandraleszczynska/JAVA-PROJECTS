package Rysunki;

import java.util.Scanner;

public class Kwadrat {
	
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
		
		System.out.println("Podaj wratość współrzędnej y");
		
		int y = sc.nextInt();
		
		System.out.println("Podaj długość boku");
		
		int bok = sc.nextInt();
		
		System.out.println("Podaj ilość powtórzeń");
		
		rekurencja = sc.nextInt();
		
		kwadrat(x,y,bok,0);
		
		}
	
	public static void kwadrat(double x, double y, double bok, int pow) 
	
	
	{
		
		pow++;
		if(rekurencja < pow)return;
		
		StdDraw.square(x, y, bok);
		
		double x1 = x - bok;
		double y1 = y - bok;
		double x2 = x + bok;
		double y2 = y - bok;
		double x3 = x + bok;
		double y3 = y + bok;
		double x4 = x - bok;
		double y4 = y + bok;
		
		StdDraw.square(x1,y1,bok/2);
		StdDraw.square(x2,y2,bok/2);
		StdDraw.square(x3,y3,bok/2);
		StdDraw.square(x4,y4,bok/2);
		
		kwadrat (x1,y2,bok/2,pow);
		kwadrat (x2, y2,bok/2,pow);
		kwadrat (x3,y3,bok/2, pow);
		kwadrat (x4,y4,bok/2, pow);
		
		
		
	}
	
	}

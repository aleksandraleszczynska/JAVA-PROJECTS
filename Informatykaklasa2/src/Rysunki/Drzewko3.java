package Rysunki;

import java.util.Scanner;

public class Drzewko3 {

	public static void main(String[] args) 
	
	{
		StdDraw.setCanvasSize(500,500);
		StdDraw.show();
		StdDraw.setXscale(-100,100);
		StdDraw.setYscale(-100,100);
		StdDraw.setPenRadius(0.004);
		
		Scanner scr = new Scanner (System.in);
		
		System.out.println("Podaj długść początkowej gałęzi");
		double l = scr.nextDouble();
		
		System.out.println("Podaj kąt w stopniach");
		double k = scr.nextDouble();
		
		double r = (k/360.0)*2*Math.PI;
		double g = l/2;
		
		int x = 0;
		int y = 0;
		
		StdDraw.line(x, y, x, y-l);
		
		drzewko(g,r,x,y,r);
		drzewko(g,-r,x,y,r);
		
	}
	
	public static void drzewko(double g, double alfa, double x, double y, double r) 
	
	{
		double skala = 0.5;
		
		if (g<0.1) return;
		
		StdDraw.line(x,y,x+g*Math.sin(alfa),y+g*Math.cos(alfa));
		
		drzewko(g*skala,alfa+r,x+g*Math.sin(alfa),y+g*Math.cos(alfa),r);
		drzewko(g*skala,alfa-r,x+g*Math.sin(alfa),y+g*Math.cos(alfa),r);
		
		
	}

}




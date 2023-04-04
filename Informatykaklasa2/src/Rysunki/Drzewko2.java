package Rysunki;

import java.util.Scanner;

public class Drzewko2 {

	public static void main(String[] args) 
	
	{
		
		StdDraw.setCanvasSize(500,500);
		StdDraw.setYscale(-100,100);
		StdDraw.setXscale(-100,100);
		StdDraw.setPenRadius(0.003);
	
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Podaj długość gałęzi :");
		
		int l = sc.nextInt();
		
		System.out.println("Podaj kąt (w stopniach) :");
		
		int k = sc.nextInt();
		
		double a = (k/360.0)*Math.PI;
		
		double x = 0;
		double y = -50;
		
		drzewko(x,y,a,l,k);

		drzewko(x,y,-a,l,k);
		
	}
	
	public static void drzewko(double x,double y, double a, double l,double alfa) 
	
	{
		double skala = 0.5;
		if(l<1) return;
		StdDraw.line(x, y,x+l*Math.sin(alfa), y+l*Math.cos(alfa));
		
		drzewko(l*skala,alfa +a,x+l*Math.sin(alfa), y+l*Math.cos(alfa),a);
		drzewko(l*skala,alfa -a,x+l*Math.sin(alfa), y+l*Math.cos(alfa),a);
	}
	
	

}

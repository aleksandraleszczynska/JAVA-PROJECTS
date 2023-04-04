package Rysunki;

import Rysunki.StdDraw;

public class Rysunek1 {

	public static void main(String[] args) 
	
	{
		
		StdDraw.setCanvasSize(500,500);
		StdDraw.setXscale(-100, +100);
		StdDraw.setYscale(-100, +100);
		StdDraw.setPenRadius(0.004);
		
		int x1 = -25;
		int x2 = 0;
		int x3 = 25;
		
		int y1 = 0;
		int y2 = 50;
		int y3 = 0;
		
		StdDraw.line(x1, y1, x2, y2);
		//StdDraw.line(x2, y2, x3, y3);
		//StdDraw.line(x3, y3, x1, y1);

	}

	
}

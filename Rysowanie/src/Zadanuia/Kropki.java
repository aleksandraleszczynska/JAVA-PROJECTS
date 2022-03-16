package Zadanuia;

import java.util.Random;

public class  Kropki {

	public static void main(String[] args) 
	
	
	{
		//StdDraw.setPenRadius(0.4);
		
		//StdDraw.setPenColor(StdDraw.RED);
		
		//StdDraw.point(0.5, 0.5);
		
		Random rnd = new Random();
		int r, g ,b;
		StdDraw.setPenRadius(0.08);
		for(int i = 0; i == i; i++) 
		{
		
		r = rnd.nextInt(256);
		g = rnd.nextInt(256);
		b  = rnd.nextInt(256);
		

		
		StdDraw.setPenColor(r, g ,b);
		StdDraw.point(Math.random(),Math.random());
		
		
		}
		
		
	}

}

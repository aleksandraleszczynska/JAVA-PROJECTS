package Zadanuia;

import java.util.Scanner;

public class Funkcjaliniowa {

	public static void main(String[] args) 
	
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj wartoœæ wspó³czynnika a");
		
		double a = sc.nextDouble();
		
		System.out.println("Podaj wartoœæ wspó³czynnika b");
		
		double b = sc.nextDouble();
		
		while(a == 0 || b == 0 ) 
		{ 
			System.out.println("Operacja nie jest mo¿liwa do wykonania");
			System.exit(0);
		  }
		
		StdDraw.setCanvasSize(400,400);
		StdDraw.setScale(-11, 11);
		
		//line(double x0, double y0, double x1, double y1);
		StdDraw.line(-10, 0, 10, 0);
		StdDraw.line(0, -10, 0, 10);
		
		for(int i = 0; i < 22; i++) 
		
		{
			for(int c = -10; c < 11; c++) 
			{ 
				StdDraw.line(c,-0.1, c, 0.1);
				StdDraw.line(-0.1, c, 0.1, c);
			}
			
		}

		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.line(-10, -10* a + b, 10, 10*a +b);
				
	}}
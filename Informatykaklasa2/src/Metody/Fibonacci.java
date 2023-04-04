package Metody;

public class Fibonacci {

	public static void main(String[] args) 
	
	{
		
		System.out.println(Fibonacci(13));

	}
	
	static int Fibonacci(int n)
	{
		if  (n == 1)
			return 0;
			
		
		if (n == 2)
			return 1;
			
		
		else
			return Fibonacci(n-2) + Fibonacci(n-1);
	
	}

}

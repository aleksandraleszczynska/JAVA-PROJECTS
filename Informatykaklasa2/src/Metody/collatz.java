package Metody;


public class collatz {

	public static void main(String[] args) 
	
	{
		int n = 1724;
		Collatz(n);

	}
	
	public static void Collatz(int n)
	
	{
		
		System.out.print(n + " ");
		
		
		if (n == 1) 
			System.exit(0);
	
		if (n%2 == 0)
		Collatz(n/2);
		else 
		Collatz(3*n + 1);
			
	
	}

}

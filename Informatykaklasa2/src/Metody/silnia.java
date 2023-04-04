package Metody;

public class silnia {

	public static void main(String[] args) 
	
	{
		System.out.println(silnia(4));
		
	}
	
	static int silnia (int n)
	
	{
		if (n == 1)
			return 1;
		else
			return n*silnia(n-1);
		
		
	}


}

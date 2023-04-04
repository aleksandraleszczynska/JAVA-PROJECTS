package Metody;

public class rekurencja1 {

	public static void main(String[] args)
	
	
	{
		hello(5);
	}
	
	public static void hello(int n)
	
	{
		 System.out.println("Aleksdandra Leszczyńska");
		 
		  if (n > 1) hello(n-1);
		  else return;
			
	}

}

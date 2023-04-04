package Metody;

public class tablica2 

{	
	public static int suma(int [] t)
	
	
	{
		int s = 0;
		
		for(int i = 0; i < t.length; i++)
			
			s = s + t[i];
			
		return s;
	
	
	}
	
	
	 public static void main(String[] args) 
	
	
	{
		 int[] tablica = {1,2,3,4};
		 
		 System.out.println(suma(tablica));
	}

	 
	 

}

public class Primes {

	public static void main(String[] args) {
		
	
		int n =100, result;

		for (int j =1; j < n ; j++) //writes number until 100
		{ 
			result = 0; 
			
			for (int i = 2; i <= j/2; i++) 
			{
				if (j % i == 0) //invoke numbers by j
				{
					result++;
					break;
				}
		
			}
			
			if (result == 0) 
			{
				System.out.println(j);
			}
		}
		
	}
		
}
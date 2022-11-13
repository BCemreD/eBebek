import java.util.Scanner; 
public class PerfectNumber {

	public static void main(String[] args) {
		// perfect numbers are number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number. 
		int n, sum=0;  
		Scanner inp=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		n=inp.nextInt();  
		
		for (int i=1; i <n; i++)//divisor (i) must not be the number itself.
		{
			if(n % i ==0)
			{
				sum += i;
			}
		}
		if (sum == n) 
		{
			System.out.println("Perrfect!");
			
		} 
		else 
	
			System.out.println("nah, it is not perfect.");
		  
	}

}

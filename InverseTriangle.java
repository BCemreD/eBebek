import java.util.Scanner;

public class InverseTriangle {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner (System.in);
		System.out.println("Enter the amount of stars you want to write.");
		int n = inp.nextInt();
		
		     //column
		  for (int i = n; i >=0 ; i--) 
	      {
	        //gap
	        for (int j = 0; j < (n - i); j++) 
	        {	            	
	          System.out.print(" ");
	        }
	        //stars
	        for (int k = 2; k <= (2 * i ); k++) 
	        {
	          System.out.print("*");
	        }
	            
	          System.out.println(" ");
	        }
	}

}

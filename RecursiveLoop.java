import java.util.Scanner;

public class RecursiveLoop {
	//return a recursive loop by taking a number and deduct 5 from it until it equals or smaller than 0, then add 5.
	static int recurs ( int r)
	{ 	
		System.out.println(r);
		if (r>0) return recurs(r-5);//if the number greater than 0, then deduct 5
		else if (r<=0) return r+5;//if the number equal or smaller than 0, add 5  
		return( recurs (r) ); 
	}
	
	 
	  
	public static void main(String[] args) 
	{ 
		Scanner inp = new Scanner (System.in);
		System.out.println("Enter numbers");
		int rc = inp.nextInt();//taking number for operation
				
		System.out.println(recurs(rc));
	
	} 

}

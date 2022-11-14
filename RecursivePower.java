import java.util.Scanner;

public class RecursivePower {
	//recursive method for exponentials
	static int power ( int b, int p)
	{ 	
		
		if (p==0) return 1;
		else return( b * power (b,p-1)); // formulate exponentials base number multiply as much as power
	}
	
	 
	  
	public static void main(String[] args) 
	{ 
		Scanner inp = new Scanner (System.in);
		System.out.println("Enter the sub");
		int pw = inp.nextInt();//taking number for sub.
		System.out.println("Enter the power");
		int sb= inp.nextInt();//taking number for power.
		
		
		System.out.println(power (pw,sb));
	
	}  
	
}

import java.util.Scanner;

public class Palindrome {

	public static void main(String [] args)
	{// numbers that can read same front to back and back to front are palindromes. You can try 101, 404...
	
		int lastNumber,sum=0,temp;   
		Scanner inp = new Scanner(System.in);
		System.out.println("Number");
		int n= inp.nextInt();//It is the number variable to be checked for palindrome  
	  
		temp=n; //assings temporal number to reuse number variable  
		while(n>0)
		{    
			lastNumber = n % 10;  //getting remainder  
			sum =(sum*10)+ lastNumber; //inverting the number from back to front by taking digits    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");    
	}	

}

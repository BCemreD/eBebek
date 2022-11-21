import java.util.Arrays;
import java.util.Scanner;

public class OrderArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter amount of numbers you want: ");
		int a=in.nextInt();
		int[] value = new int [a];
		  for (int i = 0; i < a; i++) 
	        {
	            System.out.print(i + 1+ ". number :");
	            value[i]=in.nextInt();
	        }
	         
		for (int i = 1; i<a-1; i++)
		{	
			int index = i;
			for(int j = i+1; j<a; j++)
			{
				if(value[j]< value[index])
				{
					index = j;
				}
			}
		int temp = value[i];
		value[i] = value[index];
		value[index] = temp;
		}

		System.out.println( Arrays.toString(value));
	

	}

}

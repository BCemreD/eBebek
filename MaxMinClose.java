import java.util.Scanner;
import java.util.Arrays;

public class MaxMinClose {

	    public static void main(String[] args) {
	    	 //closest min and max numbers. stil works on negative integers.
		        
	    	Scanner inp = new Scanner(System.in);
	   
	        //int[] list = {56, 34, 1, 8, 101, -2, -33};
	    	int [] nlist = {2, 25, 8 , 9 ,45};
	        
	        System.out.println("Array is " + Arrays.toString(nlist));
	        
	     	System.out.println("Enter number");
	    	int n= inp.nextInt();
	       
	    	//int min = list[0];
	        //int max = list[0];
	    	int min = nlist[0];
	        int max = nlist[0];
	    
	        for (int i : nlist) {
	            if (n<i) {
	                max = i;
	                break;
	            }

	            if (n >i) {
	                min = i;
	            }
	        }

//	        for (int i : list) 
//	        	
//	        {
//	        	int d = Math.abs(n - i);
//	        	System.out.println(d);
//	        	for (int j = 0; j < list.length; j++)
//	        	{
//	        		
//	        	}
//	        
//	        
//	        	
//	        }
	       
	        System.out.println("Minimum Değer " + min);
	        System.out.println("Maximum Değer " + max);
	       

	    }
	

}

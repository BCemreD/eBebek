
public class Diamond {

	public static void main(String[] args) {
	        
	        int n = 6;
	        
	        //makes column
	        for (int i = 0; i < n ; i++) 
	        {
	        	//left gap
	            for (int j = 0; j < (n - i); j++) 
	            {
	            	
	                System.out.print(" ");
	            }
	            
	            //stars
	            for (int k = 1; k <= (2 * i + 1); k++) 
	            {
	                System.out.print("*");
	            }
	            
	            System.out.println(" ");
	        }
	        
	        //column
	        for (int i = 6; i >=0 ; i--) 
	        {
	        	//gap
	            for (int j = 0; j < (n - i); j++) 
	            {
	            	
	                System.out.print(" ");
	            }
	            
	            //stars
	            for (int k = 1; k <= (2 * i + 1); k++) 
	            {
	                System.out.print("*");
	            }
	            
	            System.out.println(" ");
	        }
	        
	}

}



  
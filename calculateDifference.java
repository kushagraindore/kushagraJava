package assignments;

public class calculateDifference 
{
	 
	    
	        public static void main(String[] args) 
	        {
	            int a=0;
	            int b=0;
	            int i;
	            for (i=1 ; i<=10 ; i++)
	            {
	                a = a + i;
	                b = b + (i*i);
	            }
	            System.out.println("\n Sum of squares of first 10 natural numbers = " + b);
	            System.out.println("\n Square of sum of first 10 natural numbers = " + (a*a));
	            System.out.println("\n The difference between the sum of the squares of the sum of\n the first 10 natural numbers and the square of the sum is = " + ((a*a)-b));
	        }
	    }
		


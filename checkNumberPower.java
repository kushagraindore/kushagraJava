package assignments;

public class checkNumberPower {
	
	    static boolean isPowerOfTwo(int n)
	    {
	        if (n == 0)
	            return false;
	         
	        while (n != 1)
	        {
	            if (n % 2 != 0)
	                return false;
	            n = n / 2;
	        }
	        return true;
	    }
	 
	    public static void main(String args[])
	    {
	        if (isPowerOfTwo(64))
	            System.out.println("Yes, number is a power of 2");
	        else
	            System.out.println("No, number is not in a power of two");

	    }
	}



package labTwo;
public class ArrayValue 


{
	
  public static boolean contains(int[] arr, int item)
  {
      for (int n : arr) 
      {
         if (item == n) 
         {
           
        	 return true;
         }
      }
      return false;
   }
   public static void main(String[] args) {
          int[] my_array1 = {2001,2000,2002,2021,2003,2005,2045,2013};
          
  		System.out.println(contains(my_array1, 2021));
      System.out.println(contains(my_array1, 2015));
   }
}
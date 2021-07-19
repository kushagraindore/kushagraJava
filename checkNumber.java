package assignments;
import java.util.Scanner;
public class checkNumber
{
	
	public static void main(String args[])   
	{  
	int n;  
	Scanner in = new Scanner(System.in);  
	System.out.print("Enter a number: ");  
	//reading an integer from the user  
	n = in.nextInt();  
	//checks if the number is less than 100 or not  
	if (n < 100)   
	{  
	//if yes, prints not bouncy number      
	System.out.println(n + " is not a Bouncy Number.");  
	return;  
	}  
	//assigning the given number into a variable  
	int t = n;  
	boolean isIncreasing = true, isDecreasing = true;  
	int prev = t % 10;  
	while (t != 0)   
	{  
	int d = t % 10;  
	if (d > prev)   
	{  
	isIncreasing = false;  
	break;  
	}  
	prev = d;  
	t = t/10;  
	}  
	t = n;  
	prev = t % 10;  
	while (t != 0)   
	{  
	int d = t % 10;  
	if (d < prev)   
	{  
	isDecreasing = false;  
	break;  
	}  
	prev = d;  
	t = t/10;  
	}  
	//returns true if both conditions return true  
	if (!isIncreasing && !isDecreasing)  
	System.out.println(n + " is increasing.");  
	else  
	System.out.println(n + " is decreasing.");  
	}  
}

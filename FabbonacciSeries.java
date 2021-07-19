package assignments;

public class FabbonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1, result;
		result=a+b;
		System.out.println(a);
		System.out.println(b);
		for (int i=0;i<=7;i++);
		{
			result=a+b;
			a=b;
			b=result;
			System.out.println(result);
		}

	}

}

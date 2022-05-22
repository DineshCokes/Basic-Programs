import java.util.Scanner;

public class Gcd {
	//euclidean algorithm
	public static int gcd(int a,int b)
	{
		if(a==0 || b==0)
		{
			return 0;
		}
		if(a==b)
		{
			return a;
		}
		if(a>b)
		{
			return gcd(a-b,b);
		}
		else
		{
			return gcd(a,b-a);
		}
	}
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("GCD of two numbers is"+gcd(a,b));
	}

}

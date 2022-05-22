import java.util.Scanner;

public class LargestAmongthree {
	public static int Largest(int a,int b,int c)
	{
		return c>(a>b?a:b)?c:((a>b)?a:b);
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int Larger=Largest(a,b,c);
		System.out.println("The larger number is"+Larger);
		
	}
	
	

}

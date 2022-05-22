import java.util.Scanner;
public class Armstrong {
	public static void main(String args[])
	{
		int remainder,result=0;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=n;
		while(a!=0)
		{
			remainder=a%10;
			result=result+remainder*remainder*remainder;
			a=a/10;
			
		}
		if(result==n)
		{
			System.out.println("It is a armstrong number");
		}
		else
		{
			System.out.println("Not a armstrong number");
		}
		
		
	}

}

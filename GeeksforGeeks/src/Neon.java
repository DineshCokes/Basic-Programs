import java.util.Scanner;
public class Neon {
	public static void main(String args[])
	{
		int square,remainder,result=0;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		square=n*n;
		while(square!=0)
		{
	       remainder=square%10;
			result=result+remainder;
			square=square/10;
			
			
			
		}
		if(result==n)
		{
			System.out.println("It is a neon number");
		}
		else
		{
			System.out.println("Not an neon number");
		}
	}

}

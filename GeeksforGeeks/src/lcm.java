import java.util.Scanner;

public class lcm {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int lm;
		lm=a>b?a:b;
		while(true)
		{
			if((lm%a==0) &&(lm%b==0))
			{
				System.out.println("The LCM of two number is"+lm);
				break;
			}
			++lm;
		}
	}

}

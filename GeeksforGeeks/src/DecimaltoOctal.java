import java.util.Scanner;

public class DecimaltoOctal 
{
	public static void main(String args[])
	{
		int rem,dec=0,i=0;
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		while(a>0)
		{
			rem=a%8;
			dec=(int) (dec+rem*(Math.pow(10, i++)));
			a=a/8;
			
			
		}
		System.out.println("Octal Number is "+dec);
		
	}

}

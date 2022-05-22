import java.util.Scanner;

public class OctaltoDecimal 
{
	public static void main(String args[])
	{
		int rem,dec=0,i=0;
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		while(a>0)
		{
			rem=a%10;
			dec=(int) (dec+rem*(Math.pow(8,i++)));
			a=a/10;
		}
		System.out.println("Decimal Number is "+dec);
	}

}

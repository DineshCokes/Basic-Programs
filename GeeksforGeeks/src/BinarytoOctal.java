import java.util.Scanner;
public class BinarytoOctal 
{
	public static void main(String args[])
{
		long rem,temp;
		long dec=0;
		int i=0;
		Scanner in=new Scanner(System.in);
		long a=in.nextLong();
		while(a>0)
		{
			rem=a%10;
			dec=(long) (dec+(Math.pow(2,i++)*rem));
			a=a/10;		
		}
		System.out.println("The Decimal Number of Value is "+dec);
		temp=dec;
		int ans,d=0,f=0;
		while(dec>0)
		{
			ans=(int) (dec%8);
			d=(int) (d+ans*(Math.pow(10,f++)));
			
			dec=dec/8;
			
			
			
			
		}
		System.out.println("Octal Number is "+d);
		

	 	
	
  }

}

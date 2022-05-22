import java.util.Scanner;
public class Leap {
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		if((b%4==0) && (b%100!=0) || (b%400==0))
       {
	System.out.println(a+" is a leap year");
         }
		else
		{
			System.out.println(a+" not a leap year");
		}
		
		
	}

}

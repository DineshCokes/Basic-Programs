import java.util.Scanner;
public class Primenumber {

	public static void main(String args[])
	{
		int f=0;
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for(int n=1;n<=a;n++)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					f++;
				}
				
			}
			if(f==2)
			{
				System.out.println(n+"is a prime number");
			}
			f=0;
		
		

	}

}
}

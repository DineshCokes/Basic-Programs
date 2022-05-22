
public class Righttriangle 
{
	public static void RightTriangle(int n)
	{
		for(int a=0;a<n;a++)
		{
			for(int b=0;b<=a;b++)
			{
			System.out.print("* ");
		    }
			System.out.println();
	}
	}
	public static void main(String args[])
	{
		int k=5;
		RightTriangle(k);
		
	}
	
}

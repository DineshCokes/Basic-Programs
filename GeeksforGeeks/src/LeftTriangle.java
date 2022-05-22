
public class LeftTriangle 
{
	public static void LeftTriangle(int n)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int k=5;
		LeftTriangle(k);
		
	}

}

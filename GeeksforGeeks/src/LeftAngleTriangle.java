
public class LeftAngleTriangle 
{
	public static void LeftAngle(int k)
	{
		for(int i=0;i<k;i++)
		{
			for(int j=2*(k-i);j>=0;j--)
			{
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		 
	}
	public static void main(String args[])
	{
		int k=5;
		LeftAngle(k);
		
	}

}

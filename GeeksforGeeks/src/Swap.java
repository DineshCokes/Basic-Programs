
public class Swap {
	public static void Swapnumber(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("The value of a is "+a+" And the Value of b is "+b);
	}
	public static void main(String args[])
	{
		int a=4;
		int b=5;
		Swapnumber(a,b);
	}

}

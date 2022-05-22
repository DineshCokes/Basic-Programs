class Calculator
{
	public int add(int i,int j)
	{
		return i+j;
	}
}


class Calcsub extends Calculator
{
	public int sub(int i,int j)
	{
		return i-j;
	}
	
}
class Calcadv extends Calcsub
{
	public int mul(int i,int j)
	{
		return i*j;
	}
}
public class inheritance1 
{
	public static void main(String args[])
	{
		Calcadv a=new Calcadv();
		int result=a.add(1,2);
		int result1=a.sub(4,2);
		int result2=a.mul(2,3);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}

}

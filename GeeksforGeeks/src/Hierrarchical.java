class Calci
{
	public int div(int a,int b)
	{
		return (a/b);
	}
}
class Calculatr extends Calci
{
	public int mul(int a,int b)
	{
		return a*b;
	}
}
class Addition extends Calci
{
	public int add(int a,int b)
	{
		return a+b;
	}
}

public class Hierrarchical 
{
	public static void main(String args[])
	{
	Calculatr c=new Calculatr();
	Addition e=new Addition();
	int result1=c.div(6,3);
	int result2=c.mul(2,3);
	int result3=e.add(1,2);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	

}
}

class Dog
{
	void a()
	{
		System.out.println("Doberman");
	}
}
class Cat extends Dog
{
	void b()
	{
		System.out.println("Poonai");
	}
}
class Caalc
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
class Caalculator extends Caalc
{
	public int mul(int i,int j)
	{
		return i*j;
	}
}
public class Hybrid 
{
	public static void main(String args[])
	{
		Cat e=new Cat();
		Caalculator f=new Caalculator();
		e.a();
		int result=f.mul(2, 3);
		System.out.println(result);
		int result1=f.add(10,90);
		System.out.println(result1);
		
		
	}

}

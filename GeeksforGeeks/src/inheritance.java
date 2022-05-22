class parent
{
	void bike()
	{
		System.out.println("Hero");
	}
}
class Child extends parent
{
	void car()
	{
		System.out.println("Avengers");
	}
}
public class inheritance 
{
	public static void main(String[] args)
	{
	Child a=new Child();
	a.car();
	a.bike();
	

}
}

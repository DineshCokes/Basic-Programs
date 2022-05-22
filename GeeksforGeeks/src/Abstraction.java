abstract class Sekar
{
	public void bark()
	{
		System.out.println("Barking..!");
	}
	
}
class Suu extends Sekar
{
	
	
}
public class Abstraction 
{
	public static void main(String args[])
	{
	Suu a=new Suu();
	a.bark();
	}

}

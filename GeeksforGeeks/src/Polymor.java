class Bird
{
	public void sing()
	{
		System.out.println("Siuu Siuu");
	}
} 
class Ca extends Bird
{
	public void sing(String sing)
	{
		System.out.println("ping pong");
	}
}
public class Polymor 
{
	public static void main(String args[])
	{
	 Ca a=new Ca();
		a.sing();
		
	}

}

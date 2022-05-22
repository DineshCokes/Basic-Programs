class Naai
{
	void bark()
	{
		System.out.println("Bow Bow");
	}
	
}
class Dinosaur extends Naai
{
	void roar()
	{
		System.out.println("Da Da Na DarNa");
	}
}
class Cheetah extends Dinosaur
{
	void run()
	{
		System.out.println("run run run");
	}
}
public class Inheritanceeg 
{
	public static void main(String args[])
	{
		Cheetah a=new Cheetah();
		a.bark();
		a.roar();
		a.run();
		
	}

}

class Shape
{
	void draw()
	{
		System.out.println("Enter the Shape");
	}
	void NumberofSlides()
	{
		System.out.println("Number of Slides is: ");
	}
	
	
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Enter the Shape of Circle");
		
	}
	void NumberofSlides()
	{
		System.out.println("Number of slides is Circle");
	}
}
class Square extends Circle
{
	void draw()
	{
		System.out.println("Enter the Shape of Square ");
	}
	void NumberofSlides()
	{
		System.out.println("Number of Slides is Square");
	}
}
public class MethodOverriding 
{
	public static void main(String args[])
	{
		Shape a=new Shape();
		Circle b=new Circle();
		b.draw();
		b.NumberofSlides();
		a.draw();
		a.NumberofSlides();
		Square c=new Square();
		c.draw();
		c.NumberofSlides();
		
		
	}

}

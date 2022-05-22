class CircleArea
{
	public double area(double r)
	{
		return 3.14*(r*r);
		
	}
}
class SquareArea
{
	public int area(int r)
	{
		return r*r;
	}
}
class TriangleArea
{
	public int area(int x,int y)
	{
		return (int) (0.5*x*y);
	}
}
class RectangleArea
{
	public int area(int x,int y)
	{
		return x*y;
	}
}
public class MethodOverloading 
{
	public static void main(String args[])
	{
		CircleArea ca=new CircleArea();
		SquareArea sa=new SquareArea();
		TriangleArea ta=new TriangleArea();
		RectangleArea ra=new RectangleArea();
		System.out.println(ca.area(4));
		System.out.println(sa.area(68));
		System.out.println(ta.area(3, 4));
		System.out.println(ra.area(4, 5));
		
		
	}

}

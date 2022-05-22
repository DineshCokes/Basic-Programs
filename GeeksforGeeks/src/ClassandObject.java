
public class ClassandObject 
{
	String name;
	String breed;
	int age;
	String color;
	public ClassandObject(String name,String breed,int age,String color)
	{
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.color=color;
	}
	public String getName()
	{
		return name;
	}
	public String getBreed()
	{
		return breed;
	}
	public int getAge()
	{
		return age;
		
	}
	public String getColor()
	{
		return color;
	}
	
	public String toString()
	{
		return("Hi My name is "+this.getName()+"My Breed is "+this.getBreed()+"My age is "+this.getAge()+"My color is"+this.getColor());
	}
	
	public static void main(String args[])
	{
		ClassandObject tuffy=new ClassandObject("tuffy","Doberman",12,"Blue");
		System.out.println(tuffy.toString());
		
	}

}

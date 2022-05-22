class Data 
{
	private int rollno;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}
public class Encapsulation 
{
	public static void main(String args[])
	{
		Data d=new Data();
		d.setName("Dinesh");
		d.setRollno(23);
		System.out.println(d.getName());
		System.out.println(d.getRollno());
	}
	
}

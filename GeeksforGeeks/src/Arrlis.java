import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Arrlis 
{
	public static void main(String args[])
	{
		ArrayList<Double>a=new ArrayList<Double>();
		a.add(2.2);
		a.add(3.3);
		a.add(3.3);
		System.out.println(a);
		HashSet s1=new HashSet();
		s1.addAll(a);
		System.out.println(s1);
		TreeSet s2=new TreeSet();
		s2.addAll(a);
		System.out.println(s2);
		s2.remove(2.2);
		System.out.println(s2);
		System.out.println(a.contains(2.2));
		
	}

}

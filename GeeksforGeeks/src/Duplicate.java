import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate 
{
	public static void main(String args[])
	{
			Integer arr[]= {2,1,3,2,3,5,6,4,4};
			System.out.println("Element of an Array:"+Arrays.toString(arr));
			Set<Integer>serarr=new HashSet<Integer>(Arrays.asList(arr));
			System.out.println(serarr);
			System.out.println(serarr.size());
			
			
			
	}

}

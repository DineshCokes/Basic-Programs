import java.util.Arrays;
public class Decimal 
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7};
		int find=1;
		boolean check=false;
		for(int ele:arr)
		{
			if(find==ele)
			{
				check=true;
				break;
				
			}
		}
		if(check)
		{
			System.out.println(find +"is in a list");
		}
		else
		{
			System.out.println("It is not in a List");
		}
	}
}
	
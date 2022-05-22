
public class LinearSearch 
{
	public static int Search(int arr[],int n,int x)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String args[])
	{
		int arr[]= {10,20,30,40,50};
		int x=50;
		int n=arr.length;
		int index=Search(arr,n,x);
		if(index==-1)
		{
			System.out.println("Element is not found in an array");
		}
		else
		{
			System.out.println("Element is found in Position "+index);
		}
	}
	

}

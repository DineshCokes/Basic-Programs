import java.util.Scanner;
public class Vowelorconsonants {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		if(c=='a'|| c=='e'|| c=='i' || c=='o' || c=='u')
		{
			System.out.println("It is a Vowel");
		}
		else if(c=='A' || c=='E' || c=='I'|| c=='O' || c=='U')
		{
			System.out.println("It is a vowel");
		}
		else
		{
			System.out.println("It is Consonants");
		}
		
		
	}

}

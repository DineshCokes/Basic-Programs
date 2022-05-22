import java.util.Scanner;
public class Compoundinterest {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);

        double principle =in.nextDouble();
        double rate = in.nextDouble();
        		double time = in.nextDouble();
  
        /* Calculate compound interest */
        double CI = principle *
                    (Math.pow((1 + rate / 100), time));
          
        System.out.println("Compound Interest is "+ CI);
		
	}

}

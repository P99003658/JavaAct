import java.util.Scanner;
public class ExceptionArth {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int runs;
		float total;
		try
		{
			System.out.println("Enter the toal runs scored");
			runs=sc.nextInt();
			System.out.println("Enter the total overs faced");
			total=sc.nextFloat();
			float required= (runs/total);
			System.out.println("Required RunRate:" +required);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
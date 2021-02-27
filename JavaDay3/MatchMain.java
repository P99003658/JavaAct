import java.util.Scanner;

public class MatchMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.ODI\n2.T20\n3.Test");
		int i=sc.nextInt();
		System.out.println("Enter the Current Score");
		int cs=sc.nextInt();
		System.out.println("Enter the Current Over");
		float co=sc.nextFloat();
		System.out.println("Enter the Target Score");
		int ts=sc.nextInt();
		System.out.println("Requirements:");
		
		if(i==1)
		{
			
			ODIMatch obj = new ODIMatch();
			obj.setCurrentscore(cs);
			obj.setCurrentover(co);
			obj.setTarget(ts);
			float val = obj.calculateRunRate();
			int balls = obj.calculateBalls();
			obj.display(val, balls);
			
		}
		else if(i==2)
		{ 
			T20 ob=new T20();
			ob.setCurrentscore(cs);
			ob.setCurrentover(co);
			ob.setTarget(ts);
			float val = ob.calculateRunRate();
			int balls = ob.calculateBalls();
			ob.display(val, balls);
		}
		else
		{ 
			TestMatch o=new TestMatch();
			o.setCurrentscore(cs);
			o.setCurrentover(co);
			o.setTarget(ts);
			float val = o.calculateRunRate();
			int balls = o.calculateBalls();
			o.display(val, balls);
		}
		
		
	}

}

import java.util.ArrayList;
import java.util.Scanner;
public class ListActivity1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner scan=new Scanner(System.in);
	   ArrayList ar=new ArrayList();
	   System.out.println("Enter the Player Details");
	   System.out.println("Enter Player Name");
	   ar.add(scan.next());
	   System.out.println("Enter Age");
	   ar.add(scan.nextInt());
	   System.out.println("Enter Country");
	   ar.add(scan.next());      
	   System.out.println("Player Details:");
	   for(int i=0;i<ar.size();i++)
	   {
		   System.out.println(ar.get(i));
	   }
	   System.out.println("Enter Skills");
	   String s=(scan.next());
	   System.out.println("Enter the position to add the Skills");
	   int add=(scan.nextInt());
	   ar.set(add, s);
	   for(int i=0;i<ar.size();i++)
	   {
		   System.out.println(ar.get(i));
	   }
	   System.out.println("Enter the Position of the detail to be removed");
	   int rem=(scan.nextInt());
	   ar.remove(rem);
	   for(int i=0;i<ar.size();i++)
	   {
		   System.out.println(ar.get(i));
	   }
	   
	}
	

}
import java.util.Scanner;
public class StringCom
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String P1,P2;
        System.out.println("Enter First Player Name:");
	P1=sc.nextLine();
        System.out.println("Enter Second Player Name:");
	P2=sc.nextLine();
	String arr[]=P1.split(" ");
	String arr1[]=P2.split(" ");
		if(arr[arr.length-1].equals(arr1[arr1.length-1]))
		{
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
		
	}
}
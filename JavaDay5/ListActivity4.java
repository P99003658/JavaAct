import java.util.ArrayList;
import java.util.Scanner;

public class ListActivity4 {

	public static void main(String[] args) {
         ArrayList<Integer> al=new ArrayList<Integer>();
         System.out.println("Enter the number of innings:");
         Scanner sc=new Scanner(System.in);
         int s=sc.nextInt();
         System.out.println("Enter the scores:");
         for(int i=0;i<s;i++)
         {
        	 al.add(sc.nextInt());
         }
         int fifty=0,hundred=0;
         for(int i=0;i<s;i++)
         {
        	 if(al.get(i)>=50 && al.get(i)<100)
        		 fifty++;
        	 else if(al.get(i)>=100)
        		 hundred++;
        		 
         }
         System.out.println("Number of 50s/100s scored:" +"\n"+fifty+"\n"+hundred);

	}
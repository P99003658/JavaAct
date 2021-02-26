import java.util.Scanner;
class StringAct
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String stringF,stringS;
System.out.println("Enter First Name: ");
stringF=sc.next();
System.out.println("Enter Last Name: ");
stringS=sc.next();
String firstLetter = stringF.substring(0, 1);
String lastLetter= stringF.substring(stringF.length()-1);
String remainingLetters = stringF.substring(1, stringF.length()-1);

firstLetter = firstLetter.toUpperCase();
lastLetter =lastLetter.toLowerCase();
stringF=firstLetter+remainingLetters+lastLetter;
stringS=stringS.toUpperCase();
    stringF = firstLetter + remainingLetters+lastLetter;
    System.out.println("Name: " + stringF +" "+stringS);

}

}
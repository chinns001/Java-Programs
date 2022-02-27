import java.util.Scanner;

public class reversstring {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
{
    String str;
    String revstr="";
    System.out.print("Enter a string :- ");
    str = sc.nextLine();
    int length = str.length();
    for(int i=length-1; i>=0; i--)
    {
        revstr = revstr + str.charAt(i);
    }
    System.out.print("The reverse string is :-"+ revstr);
}
}    
}

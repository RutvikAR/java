import java.util.Scanner;
public class rev {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter starting to stevense ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println ("Reversed staing : ");
        System.out.println(sb.reverse().toString()); 
        sc.close();
    }
}
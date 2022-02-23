import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class arop
{
    public static void arithmetic (float a, float b, String c)
    {
        float n1=a, n2 = b, ans = 0;
        String s1=c;
        switch (s1)
        {
            case "+" :
                ans = n1 +n2;
                System.out.println("Sum : "+ ans);
                break;
            case "-" :
                ans = n1-n2;
                System.out.println("sub : "+ans);
                break;
            default:
            System.out.println("enter + or - op");
        }
    }

    public static void main (String [] args){
        float a, b;
        String c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 nos and +/- op");
        a =  sc.nextInt();
        b =  sc.nextInt();
        c =  sc.next();
        arithmetic(a, b, c);
    }
}
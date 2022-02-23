import java.util.Scanner;

class positive
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int a = sc.nextInt();
        if(a>=0)
        {
            if(a==0)
            {
                System.out.print("number is zero");
            }
            else{
                System.out.print("number is positive");
            }
        }
        else{
            System.out.print("number is negitive");
        }
    }
}
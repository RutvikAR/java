public class asmd
{
    public static void main (String [] args){
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        float a,s,m,d;
        a = n1 + n2 ;
        s = n1 - n2;
        m = n1 * n2;
        d = n1 / n2;
        System.out.println("addition : "+a);
        System.out.println("subtration : "+s);
        System.out.println("multiplication : "+m);
        System.out.println("division : "+d);
    }
}

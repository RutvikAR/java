public class odev {
    public static void main(String[] args) {
        int n=10,e=0,o=0;
        while (n<=15)
         {
            if (n%2==0) 
            {
                e++;
            }
            else
            {
                o++;
            }
            n++;
        }
        System.out.print("total even ="+e);
        System.out.print("total odd ="+o);

    }
}

import java.util.Scanner;

public class marksheet {
    public static void main(String[] args) {
        int total=0;
        int []m = new int[4];
            Scanner s = new Scanner(System.in);
            for(int i=0 ; i<=3 ; i++)
            {
                m[i] = s.nextInt();
                total +=m[i];
            }
            int per = total/4;
            if(per<=70)
            System.out.print("grade A+");
            else if(per<=60)
            System.out.print("grade A");
            else if(per<=50)
            System.out.print("grade B");
            else if(per<=40)
            System.out.print("grade C");
            else
            System.out.print("fail");
            s.close();
    }    
}

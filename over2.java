class me
{   
    void disp(int m1,int m2,int m3,int m4)
    {
       int  total =m1+m2+m3+m4;
        int per = total/2;
        System.out.println("your per :"+ per);        
    }
}
class you extends me
{
    void disp(int m1,int m2,int m3,int m4)
    {
        int total =m1+m2+m3+m4;
        int per = total/2;
        System.out.println("your friend per :"+ per);   
    }
}
public class over2 {
    public static void main(String[] args) {
        me a1 = new me();
        me b1 = new you();
        a1.disp(33,32,32,23);
        b1.disp(23,23,23,23);
    }
}

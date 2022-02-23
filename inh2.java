class a1
{
    {
        System.out.println("IIB of hase class"); 
    }
    public void disp() 
    {
    System.out.println("This is disp");
    }
}
public class inh2 extends a1
{
    public static void main (String [] args)
    {
        a1 b = new a1();
        b.disp();
    }
}
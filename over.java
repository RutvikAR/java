class a{
    public void bca()
    {
        System.out.print("this is method ");
    }
}
class b extends a
{
    public void bca()
    {
        super.bca();
        System.out.print("this is child class ");
    }
}
class over{
    public static void main(String[] args) {
        b a1 = new b();
        a1.bca();  
    }
}
